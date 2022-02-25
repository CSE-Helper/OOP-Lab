import java.util.*;
public class qn44 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String smallest=str ,largest="";
        String arr[]=str.split(" ");
        for(String e:arr){
            if(smallest.length()>e.length()){
                smallest=e;
            }
            if(largest.length()<e.length()){
                largest=e;
            }

        }
        System.out.println("Smallest word: "+smallest);
        System.out.println("Largest word: "+largest);
    }
}
