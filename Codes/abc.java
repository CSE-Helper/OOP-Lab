import java.io.*;
import java.util.*;

public class abc {
    public static void main(String[] args) throws FileNotFoundException {
        String str = " ";
        File f = new File("paste the input path here");
        Scanner read = new Scanner(f);
        while (read.hasNext()) {
            str += read.next();
        }
        int count = 0;
        String st = str.replaceAll(" ", " ");
        String s = st;
        System.out.println(s);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e')
                res++;
        }
        System.out.println(res);
    }

}