import java.util.*;
public class qn40 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        for(int i=1;i<=num;i++){
            for(int a=1;a<=num;a++){
                if(a==i){
                    System.out.print(a);
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int a=num-1;a>=1;a--){
                if(a==i){
                    System.out.print(a);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=num-1;i>=1;i--){
            for(int a=1;a<=num;a++){
                if(a==i){
                    System.out.print(a);
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int a=num-1;a>=1;a--){
                if(a==i){
                    System.out.print(a);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
