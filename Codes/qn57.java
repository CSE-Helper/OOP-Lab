import java.io.*;
import java.util.*;
class GradeException{
    Hashtable<Integer , String> ht=new Hashtable<>();
    public static String grade[]=new String[7];
    static{
        grade[0]="A";
        grade[1]="B";
        grade[2]="C";
        grade[3]="D";
        grade[4]="E";
        grade[5]="F";
        grade[6]="I";
    }
    void validGrade(int id , String c)throws Exception{
        List <String> GradeList = new ArrayList<>(Arrays.asList(grade));
        if(GradeList.contains(c)){
            ht.put(id,c);
        }
        else throw new Exception("Grade Exception");
    
    }
    void display(){
        System.out.println("Key/Values in HasHtable are:\n"+ht); 
    }
}
public class qn57{
    public static void main (String arg[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        GradeException g = new GradeException();
        int ID[] = new int[5];
        String grd;
        for(int i=0;i<5;i++){
            ID[i]=i+101;
            System.out.print("The Student ID is :"+ID[i]+"\nEnter the grade: ");
            grd=in.readLine();
            try{
                g.validGrade(ID[i],grd);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        g.display();
    }
}
