import java.util.*;
public class qn26 {
    public static void main(String arg[]){
        String input ;
        Scanner in = new Scanner (System.in);
        input=in.nextLine();
        Map<String,Integer> map = new HashMap<>();
        ArrayList<String> newarray = new ArrayList<>(Arrays.asList(input.split("")));
        for(String s:newarray){
            if(map.containsKey(s)){
                int num=map.get(s);
                map.replace(s, num, num+1);
            }
            else{
                map.put(s, 1);
            }
        }

        String key ;
        key = in.nextLine();
        System.out.println(map.get(key));
        
    }
    
}
