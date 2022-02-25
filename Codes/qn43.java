import java.util.*;
public class qn43 {

    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String sub1=in.nextLine();
        String sub2=in.nextLine();
        str=str.replaceAll(sub1, sub2);
        System.out.println(str);
    }
    
}
