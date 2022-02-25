import java.util.*;
public class qn29 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int e;
        ArrayList<Integer> al = new ArrayList<>();
        for( int i=0 ;i<N;i++){
            e=in.nextInt();
            al.add(e);
        }

        Collections.sort(al);
        for(int i=0 ;i<K;i++){
            System.out.print(al.get(0)+" ");
            al.remove(0);
        }

        for(int i=al.size()-1;i>=0;i--){
            System.out.print(al.get(i)+" ");
        }
    }
}
