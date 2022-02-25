import java.util.*;
public class qn37 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        int e=0;
        for (int i=0;i<n;i++){
            e=in.nextInt();
            al.add(e);
        }
        int num = in.nextInt();
        al.remove((Integer)num);
        for(int i:al){
            System.out.print(i+" ");
        }
    }
}
