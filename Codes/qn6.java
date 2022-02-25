import java.util.*;
public class qn6 {
    public static void main(String arg[]){

        Scanner in = new Scanner(System.in);
        String str1,str2;
        str1=in.nextLine();
        str2=in.nextLine();
        List<String> myList1 = new ArrayList<String>(Arrays.asList(str1.split("")));
        List<String> myList2 = new ArrayList<String>(Arrays.asList(str2.split("")));
        String s1="" ,s2="";
        for(String a:myList1){
            if(!myList2.contains(a)){
                
                s1=s1+a;
            }
        }
        for(String a:myList2){
            if(!myList1.contains(a)){
                s2=s2+a;
            }
        }

        System.out.println(s1+s2);
        

    }
    
}
