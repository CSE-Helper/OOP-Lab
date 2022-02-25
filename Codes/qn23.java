import java.util.*;
public class qn23 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        char arr[]=s.toCharArray();
        List <String> vov = new ArrayList<>(Arrays.asList("aeiouAEIOU".split("")));
        String temp;
        String Max_String = "" ;
        int max_int=0;
        for(char a: arr){
            String e=Character.toString(a);
            if(vov.contains(e)){
                Max_String+=e;
            }
            else{
                if(max_int<Max_String.length()){
                    max_int=Max_String.length();
                }
                Max_String="";
            }
        }
        System.out.println(max_int);
    }
}
