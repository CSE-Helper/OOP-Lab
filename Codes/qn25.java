import java.util.*;
public class qn25 {
    public static void main(String arg[]){
        Scanner in = new Scanner (System.in);
        int X,Y,K,num=0;
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        X=in.nextInt();
        Y=in.nextInt();
        K=in.nextInt();
        for(int i=0 ;i<X;i++){
            num=in.nextInt();
            a1.add(num);
        }
        for(int i=0 ;i<Y;i++){
            num=in.nextInt();
            a2.add(num);
        }
        int count=0;
        for(int a:a1){
            for(int b:a2){
                if(a+b ==K){
                    if(count>0){
                        System.out.print(",");
                        System.out.print(" "+a+" "+b);
                    }
                    else{
                        System.out.print(a+" "+b);
                    }
                    
                    count++;
                }
            }
        }
    }
}
