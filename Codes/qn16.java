import java.util.*;
public class qn16 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int sum=0;
        for(int i=12;i<=50;i++){
            if((i%3==0)&&(i%5==0)){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
