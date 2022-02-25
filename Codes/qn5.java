import java.util.*;
public class qn5 {
    public static void main(String arg[]){
        int num=0,s=1;
        Scanner in = new Scanner (System.in);
        num=in.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<s;j++){
                System.out.print("*");
            }
            System.out.print("\n");
            s+=2;
        }
    }
}
