import java.util.*;
public class qn2 {
    public static void main (String arg[]){
        int D , N;
        Scanner in = new Scanner(System.in);
        N=in.nextInt();
        D=in.nextInt();
        System.out.print("(");
        for(int i =1 ; i<N ;i++){
            System.out.print(D+"+");

        }
        System.out.print(D+")/"+D);
    }
}
