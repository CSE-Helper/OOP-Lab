import java.util.*;
public class qn31 {
    public static void main(String arg[]){
        Scanner in = new Scanner (System.in);
        String str = in.nextLine();
        String arr[] = str.split(" ");
        String temp="";
        for(int i=0 ;i<arr.length;i++){
            temp+=Character.toString(arr[i].charAt(0)).toUpperCase();
            temp+=arr[i].substring(1, arr[i].length());
            temp+=" ";
        }
        System.out.println(temp);
    }
    
}
