import java.util.*;
public class qn8 {
    public String check(String num){
        switch(num){
            case "0":
                return "zero";
            case "1":
                return "one";
            case "2":
                return "two";
            case "3":
                return "three";
            case "4":
                return "four";
            case "5":
                return "five";
            case "6":
                return "six";
            case "7":
                return "seven";
            case "8":
                return "eight";
            case "9":
                return "nine";
            default:
                return "";
        }
    }

    public static void main(String arg[]){
        String str;
        qn8 obj = new qn8();
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        ArrayList<String> al = new ArrayList<>(Arrays.asList(str.split("")));
        for(String s: al){
            System.out.print(obj.check(s)+" ");
        }

    }
}
