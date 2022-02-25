import java.io.*;
import java.util.*;
class SortedList{
    ArrayList <Integer> array = null;
    SortedList(){
        array = new ArrayList<Integer>();
    }
    public void add(int u ){
        array.add(u);
        Collections.sort(array);
    }
    public boolean isEmpty(){
        return array.isEmpty();
    }
    public int getFirst(){
        return array.get(0);
    }
    public int getLast(){
        return array.get(array.size()-1);
    }
}
public class qn69{
    public static void main(String arg[]){
        String data = null ;
        Scanner sc = new Scanner (System.in);
      data=sc.nextLine();
        try{
            File fi = new File(data.trim());
            FileReader fr = new FileReader(fi);
            BufferedReader dip = new BufferedReader(fr);
            String i;
            SortedList sl = new SortedList();
            while((i=dip.readLine())!=null){
                sl.add(Integer.parseInt(i)); 
            }
            if(sl.isEmpty()){
                System.out.println(" Empty array");
                System.out.println("min undefined");
                System.out.println("max undefined");
            } 
            else{
                System.out.println(" min = "+ sl.getFirst());
                System.out.println("max = "+ sl.getLast());
            }
            fr.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
