import java.util.*;
public class qn33 {
    public static double check(int i){
        double sum=0;
        if(i==24){
            sum=80;
            return sum;
        }
        if(i<=3){
            sum+=30;
            return (double)sum;
        }
        else{
            sum=30+((i-3)*5);
            return sum;

        }

    }
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer,Integer> mp=new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            int no , hr;
            no=in.nextInt();
            hr=in.nextInt();
            mp.put(no, hr);
            al.add(no);

        }
        for(int i:al){
            double rs = qn33.check(mp.get(i));
            System.out.println(i+" "+mp.get(i)+" "+rs);
        }
        
    }
    
}
