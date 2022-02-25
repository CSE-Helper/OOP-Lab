import java.util.*;
public class qn39 {
    public static void main (String arg[]){
        Scanner in = new Scanner(System.in);
        int X= in.nextInt();
        int num = in.nextInt();
        if(num<50){
            System.out.printf("%.2f",(double)X*num);
        }
        else if(num>=50 && num<=100){
            double rs=X*num;
            rs=rs-(rs*10/100);
            System.out.printf("%.2f",rs);

        }
        else if(num>=101 && num<=200){
            double rs=X*num;
            rs=rs-(rs*20/100);
            System.out.printf("%.2f",rs);

        }
        else if(num>=201 && num<=400){
            double rs=X*num;
            rs=rs-(rs*30/100);
            System.out.printf("%.2f",rs);

        }
    }
}
