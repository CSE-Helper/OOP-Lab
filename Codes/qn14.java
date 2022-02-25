import java.util.*;
public class qn14 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int p=1 , s=0;
        int num;
        for(int i=0 ;i<n;i++){
            num=in.nextInt();
            p*=num;
            s+=num;
        }

        if((s%2)==0){
            System.out.println(s);
        }
        else{
            System.out.println(p);
        }

    }
    
}
