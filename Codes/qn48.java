import java.util.*;
public class qn48 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        String st=in.nextLine();
        int mid=st.length()/2;
        if(st.length()%2==0){
            System.out.println(st.charAt(mid-1)+""+st.charAt(mid));
        }
        else{
            System.out.println(st.charAt(mid));
        }
    }
}
