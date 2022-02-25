import java.util.*;
public class qn21 {
    public static void main(String arg[]){
        String arr[]="ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        for(int i=num;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(arr[j+i-2]);
            }
            System.out.println();
        }
    }
}
