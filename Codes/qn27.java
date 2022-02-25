import java.util.*;
class qn27
{
    public static void main(String[] args)
    {
        int c;
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt() ;
        int b=sc.nextInt();
        c=(a>b)?b:a;
        for(int i=c;i>1;i--){
            if(a%i==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}