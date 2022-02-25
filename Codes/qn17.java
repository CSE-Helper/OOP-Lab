import java.util.*;
public class qn17 {
    public static boolean check(int a){
        String str= Integer.toString(a);
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        for(int i=a ;i<=b;i++){
            if(qn17.check(i)){
                System.out.print(i+" ");
            }
        }


    }
}
