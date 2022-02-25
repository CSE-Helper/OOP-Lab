class sample{
    public int add(Integer... i){
        int sum=0;
        for(int n:i){
            sum=sum+n;
        }
        return sum;
    }
    public double add(Double... i){
        double sum=0;
        for(double n:i){
            sum=sum+n;
        }
        return sum;
    }
}
public class qn59{
    public static void main (String arg[]){
        sample obj = new sample();
        int e1=1 , e2=2 , e3=3;
        double e4=9.3 , e5=6.1;
        System.out.println("Sum of Three integers: "+obj.add(e1,e2,e3));
        System.out.println("Sum of Two integers: "+obj.add(e3,e1));
        System.out.println("Sum of Two doubles: "+obj.add(e4,e5));
    }
}