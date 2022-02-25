import java.util.*;
public class qn11 {
    public static int count=1;
    public boolean check(ArrayList<Integer> a1 ,ArrayList<Integer> a2 ){
        int A1=a1.get(0)*100+a1.get(1);
        int A2=a1.get(2)*100+a1.get(3);
        int B1=a2.get(0)*100+a2.get(1);
        int B2=a2.get(2)*100+a2.get(3);
        if((B1>=A1) && (B1<A2) ){
            return true;
        }
        else if((A1>=B1)&&(A1<B2)){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String arg[]){
        qn11 obj = new qn11();
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        ArrayList<ArrayList> list = new ArrayList<>();
        for(int i=0 ; i<num;i++){
            ArrayList<Integer> numal = new ArrayList<>();

            int k;
            for(int j=0 ;j<4;j++){
                k=in.nextInt();
                numal.add(k);
            }
            if(list.size()!=0){
                for(ArrayList l :list){
                    if(obj.check(l, numal)){
                        qn11.count++;
                    }
                }
            }
            list.add(numal);

        }
        System.out.println(qn11.count);

    }
    
}
