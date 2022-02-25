import java.util.*;

public class qn51 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String bit_32="00000000000000000000000000000000";
        String bin = "";
        while(num!=0){
            if(num%2==1){
                bin+=Integer.toString(1);
            }
            else{
                bin+=Integer.toString(0);
            }
            num/=2;
        }
        StringBuilder stb = new StringBuilder();
        stb.append(bin);
        bin =stb.reverse().toString();
        bit_32=bit_32.substring(0,bit_32.length()-bin.length());
        bit_32+=bin;
        bit_32=bit_32.replace("0", "9");
        bit_32=bit_32.replace("1", "0");
        bit_32=bit_32.replace("9", "1");
        stb.delete(0, stb.length());
        stb.append(bit_32);
        bin =stb.reverse().toString();
        long sum=0L;
        for(int i=0;i<bin.length();i++){
            String e=Character.toString(bin.charAt(i));
            if(e.equals("1")){
                sum+=Math.pow(2,i);
            }
        }
        System.out.println(sum);

    }
}
