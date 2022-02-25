import java.util.*;
public class qn53{
    public static String check(int i){
        if(i%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        int max=0 , index=0,e;
        int sum=0,count=0;
        int size=list.size();
        size=(size%2==0)?size/2:(size/2)+1;
        String set="";
        for(int j=0 ;j<list.size();j++){
            if(count<size){
                for(int i=0 ;i<list.size();i++){
                    e=Integer.parseInt(list.get(i));
                    if(e>max){
                        max=e;
                        index=i;
                    }
                }
                if(j==0){
                    set=qn53.check(index);
                    sum+=max;
                    count++;
            

                }
                else if(j>0){
                    if(set.equals(qn53.check(index))){
                        sum+=max;
                        count++;
                
                    }
                }
                list.set(index,"0");
                max=0;
                index=0;
            }
            else{
                break;
            }

        }
        System.out.println(sum);
    }
}