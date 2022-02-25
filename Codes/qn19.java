import java.util.*;
public class qn19 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        String s;
        String arr[]={"a","e","i","o","u","A","E","I","O","U"};
        ArrayList<ArrayList> al = new ArrayList<>();
        for(int i=0;i<num;i++){
            s=in.nextLine();
            ArrayList<String> st = new ArrayList<>(Arrays.asList(s.split("")));
            for(String e:arr){
                if(st.contains(e)){
                    st.remove(e);
                }
            }
            al.add(st);

        }

        for(ArrayList<String> a:al){
            for(String e:a){
                System.out.print(e);
            }
            System.out.println();
        }
    }
}
