interface IntOperations {
    void integer();
    void evenodd();
    void prime();
    void factorial();
    void sumofdigit();
}
class MyNumber implements IntOperations{
    public int n;
    MyNumber(){n=0;}
    MyNumber(int i){n=i;}
    public void integer(){
        if(n>0){
            System.out.println(n+" is a Positive Number");
        }
        else System.out.println(n+" is a Negative Number");
    }
    public void evenodd(){
        if(n%2==0){
            System.out.println(n+" is a Even Number");
        }
        else System.out.println(n+" is a Odd Number");
    }
    public void prime(){
        int h=n/2;
        boolean fg=false;
        for(int i=2 ; i<=h ; i++){
            if(n%i==0) fg=true;
        }
        if(fg) System.out.println(n+" is not a Prime Number");
        else System.out.println(n+" is a Prime Number");
    }
    public void factorial(){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        System.out.println("The factorial of "+n+" is "+f);
    }
    public void sumofdigit(){ 
        int temp=n,sum=0;
        while(temp !=0){
            sum+=temp%10;
            temp/=10;
        }
        System.out.println("Sum of it's digits is "+sum);
    }
}
public class qn61{
    public static void main(String arg[]){
        MyNumber m=new MyNumber(11);
        MyNumber m2=new MyNumber(14);
        m.integer();
        m.evenodd();
        m.prime();
        m.factorial();
        m.sumofdigit();
        System.out.println();
        m2.integer();
        m2.evenodd();
        m2.prime();
        m2.factorial();
        m2.sumofdigit();
        
        
    }
}
