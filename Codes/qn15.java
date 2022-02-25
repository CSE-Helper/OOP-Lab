import java.util.*;
public class qn15 {
    public static void main(String arg[]){
        int N,M,K;
        Scanner in = new Scanner (System.in);
        N=in.nextInt();
        M=in.nextInt();
        K=in.nextInt();
        ArrayList <Integer> alM = new  ArrayList<Integer>();
        ArrayList <Integer> alK = new  ArrayList<Integer>();
        Set <Integer> set = new HashSet<>();
        int n=0;

        for(int i=0; i<M;i++){
            n=in.nextInt();
            alM.add(n);
            set.add(n);

        }
        for(int i=0; i<K;i++){
            n=in.nextInt();
            alK.add(n);
            set.add(n);

        }
        ArrayList <Integer> al3 = new ArrayList<Integer>(alM);
        al3.retainAll(alK);
        int num1 , num2;
        num1=al3.size();
        num2=N-set.size();
        System.out.println(num1+" "+num2);

    }
    
}
