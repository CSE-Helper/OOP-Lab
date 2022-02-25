import java.util.*;
public class qn12 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=0 ; i<num;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=num;i>0;i--){
            for(int j=1 ;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
