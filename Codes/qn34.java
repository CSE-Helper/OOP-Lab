import java.util.*;

public class qn34 {
    public static boolean isPrime(int num){
        boolean fg=true;
        for(int i=2 ; i<num;i++){
            if(num%i ==0){
                fg=false;
                return false;
            }
        }
        if(fg){
            return true;
        }
        else{
            return true;
        }
    }
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        int i=in.nextInt();
        String [] vt= s.split("");
        ArrayList<Integer> al = new ArrayList<>();
        for(int n=0;n<vt.length;n++){
            if(vt[n].equals("1")){
                if(qn20.isPrime(n+1)){
                    
                    for(int j=1;j<=i;j++){
                        if(!al.contains(j*(n+1))){
                        al.add(j*(n+1));
                    }
                    }
                }
                else{
                    vt[n+1]="0";
                }
            }
        }
        Collections.sort(al);
        System.out.println(al.get(i-1));

    }
    
}
