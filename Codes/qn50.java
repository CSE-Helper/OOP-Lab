import java.util.*;
public class qn50 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        ArrayList<String>list=new ArrayList<>(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
        ArrayList<Integer>al1=new ArrayList<>();
        ArrayList<Integer>al2=new ArrayList<>();

        for(int i=num-1;i>=0;i--){
            al1.add(i);
            if(i<num-1){
                al2.add(num-i-1);
            }
            int n1=1;
            for(int j=0;j<num;j++){
                if(al1.contains(j)){
                    System.out.print(list.get(num-n1));
                    if(j<num-1){
                        System.out.print("-");

                    }
                    n1++;
                }
                else{
                    System.out.print("--");
                }
            }
            int n2=al2.size();
            for(int j=1;j<num;j++){
                if(al2.contains(j)){
                    System.out.print("-"+list.get(num-n2));
                    n2--;
                }
                else{
                    System.out.print("--");
                }
            }
            System.out.println();
        }
        al1.remove((Integer)0);
        for(int i=1;i<=num-1;i++){
            al2.remove((Integer)i);
            int n1=1;
            for(int j=0;j<num;j++){
                if(al1.contains(j)){
                    System.out.print(list.get(num-n1));
                    if(j<num-1){
                        System.out.print("-");

                    }
                    n1++;
                }
                else{
                    System.out.print("--");
                }
            }
            int n2=al2.size();
            for(int j=0;j<=num-2;j++){
                if(al2.contains(num-j-1)){
                    System.out.print("-"+list.get(num-n2));
                    n2--;
                }
                else{
                    System.out.print("--");
                }
            }
            System.out.println();
            al1.remove((Integer)i);
            
                
            
        }
    }
}
