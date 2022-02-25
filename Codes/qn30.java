import java.util.*;
public class qn30_1 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String arr[] = str.split(" ");
        String NewStr="";
        for(int i=0 ; i<arr.length;i++){
            String s= arr[i];
            StringBuilder stb = new StringBuilder();
            stb.append(s);
            s=stb.reverse().toString();
            NewStr=NewStr+s+" ";
        }
        System.out.println(NewStr);
    }
}
