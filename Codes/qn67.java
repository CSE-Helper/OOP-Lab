import java.util.*;
public class qn67 { 
    public static void main(String[] args) { 
        ArrayList<ArrayList> numList = new ArrayList<ArrayList>();
        int n=0;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
    
        for(int k =0 ; k<n ; k++){
            ArrayList<Integer> na = new ArrayList<Integer>();
            int nr = in.nextInt();
            na.add(nr);
            for(int j =0 ; j<nr ; j++){
                int elm = in.nextInt();
                na.add(elm);
            }
            numList.add(na);
        }
        n=in.nextInt();
    
        for(int k =0 ; k<n ; k++){
    
            try {
                int x=in.nextInt();
                int y=in.nextInt();
                System.out.println(numList.get(x-1).get(y-1)); 
            } catch (Exception e) { 
            //TODO: handle exception
                System.out.println("ERROR!");
            }
        }
    }
}