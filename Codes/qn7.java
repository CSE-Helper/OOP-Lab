import java.util.*;
public class qn7 {
    public boolean check(String s){
        char arr[]=s.toCharArray();
        String numbers="123456789";
        Arrays.sort(arr);
        s="";

        for(char a:arr){
            s+=a;
        }
        if(s.equals(numbers)){
            return true;
        }
        else
            return false;
    }
    public static void main (String arg[]){
        qn7 obj = new qn7();
        String num;
        Scanner in = new Scanner (System.in);
        String numbers="123456789";
        ArrayList <String> rnum = new ArrayList<>(Arrays.asList(numbers.split("")));
        num = in.nextLine();
        int input=Integer.parseInt(num);
        for(int i=0;i<num.length();i++){
            rnum.remove(Character.toString(num.charAt(i)));
        }
        int size=rnum.size();
        ArrayList<String> arl2 = new ArrayList<String>(rnum);
        String ot;
        boolean flag=true;
        int it=0;
        while(flag){
            ArrayList <String> temp = new ArrayList<>();
            for(String b:rnum){
                for(int i =0 ; i<arl2.size();i++){
                    if(b.length()+arl2.get(i).length() >size+1){
                        System.out.println("no");
                        flag=false;
                        return;
                    }
                    int num1=Integer.parseInt(b);
                    int num2=Integer.parseInt(arl2.get(i));
                    if(num1*num2 == input){
                        if(obj.check(num+arl2.get(i)+b)){
                            System.out.println(num+b+arl2.get(i));
                            System.out.println("\nyes");
                            flag=false;
                            return;
                        }
                        else{
                            temp.add(arl2.get(i)+b);
                        }
                    }
                    else{
                    temp.add(arl2.get(i)+b);
                    
                    it++;
                }
                
                }
                
            }
            arl2.addAll(temp);
            rnum.addAll(temp);
            temp.clear();
        }
    }
    
    
}
