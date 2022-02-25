import java.io.*;
import java.util.*;
 
class qn32 {
 
    public static void split(String str)
    {
        int len = str.length();
 
        if (len == 1) {
            System.out.println("Not Possible");
            return;
        }
 
        String s1 = "", s2 = "";
        long num1, num2;
 
        for (int i = 0; i <= len / 2; i++) {
 
            int flag = 0;
 
            s1 = str.substring(0, i + 1);
            num1 = Long.parseLong((s1));
            num2 = num1 + 1;
 
            s2 = Long.toString(num2);
            int k = i + 1;
            while (flag == 0) {
                int l = s2.length();
                if (k + l > len) {
                    flag = 1;
                    break;
                }
 
                if ((str.substring(k, k + l).equals(s2))) {
                    flag = 0;
 
                    num2++;
                    k = k + l;
                    if (k == len)
                        break;
                    s2 = Long.toString(num2);
                    l = s2.length();
                    if (k + 1 > len) {
 
                        flag = 1;
                        break;
                    }
                }
 
                else
                    flag = 1;
            }
 
            if (flag == 0) {
                System.out.println("Possible"
                                   + " " + s1);
                break;
            }
             else if (flag == 1 && i > len / 2 - 1) {
                System.out.println("Not Possible");
                break;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        split(str);
    }
}