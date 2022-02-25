import java.util.*;
public class qn66{
    public static void main(String arg[]){
        System.out.println("number of terms :");
        int n;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        System.out.println("\n");
        System.out.println("imput string is :");
        String str;
        in.nextLine();
        ArrayList<String> al = new ArrayList<String>();
        for (int u =0 ; u<n ; u++ ){
            str=in.nextLine();
            al.add(str);
        }
        System.out.println("\n");
        System.out.println("program output:");
        String arr[] ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        boolean flag=false;
        for (String g: al){
            for (String k: arr){
                if(g.contains(k)){
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
    
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }  
        }
    }
}