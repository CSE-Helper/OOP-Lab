import java.util.*;
public class qn46 {
    public static int prod(int num){
        int p =1;
        while(num!=0){
            p*=num%10;
            num/=10;
        }
        return p;
    }
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int e;
        List<Integer> al = new ArrayList<>();
        for(int i=0;i<num;i++){
            e=in.nextInt();
            al.add(e);
        }
        ArrayList<Integer> sorted = new ArrayList<>();
        int size=al.size();
        for(int i=0 ;i<size;i++){
            int min=1000;
            int elm=0;
            for(int a:al){
                if(qn46.prod(a)<min){
                    min=qn46.prod(a);
                    elm=a;
                }
            }
            sorted.add(elm);
            al.remove((Integer)elm);
        }

        for(int i:sorted){
            System.out.print(i+" ");
        }
    }
}
