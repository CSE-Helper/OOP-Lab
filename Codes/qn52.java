import java.util.*;
public class qn52 {
    public static int find_len(String s,ArrayList<String> al){
        int count=0;
        for(String str : al){
            if(str.equals(s)){
                count++;
            }
        }
        return count;
    }
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s="";
        String result="";
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            s=in.next();
            list.add(s);
        }
        Set<String> set = new HashSet<>(list);
        int size=set.size();
        for(int i=0 ;i<size;i++){
            int max=0;
            for(String st:set){
                if(qn49.find_len(st, list)>max){
                    max=qn49.find_len(st, list);
                    s=st;
                }
            }
            for(int j=0 ; j<max;j++){
                result+=s+" ";
            }
            
            list.remove(s);
            set.remove(s);
            max=0;
            
        }
        System.out.println("\n"+result);

    }
}
