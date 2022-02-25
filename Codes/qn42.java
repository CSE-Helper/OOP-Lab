import java.util.*;
public class qn42 {
    public static void main(String arg[]){
        Scanner in= new Scanner(System.in);
        String str=in.nextLine();
        ArrayList<String> al = new ArrayList<>();
        for(int j=0;j<str.length();j++){
            for(int k=0;k<str.length();k++){
                String s="";
                for(int i=j;i<=k;i++){
                    s+=str.charAt(i);
                }
                if(!s.equals("")){
                    al.add(s);
                }
            }
        }
        int sum=0;
        for(String s:al){
            sum+=Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
