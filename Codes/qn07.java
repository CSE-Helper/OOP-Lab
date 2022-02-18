import java.util.Scanner;
import java.util.*;

public class pandigitalproduct {
    // Java code to check the number
    // is Pandigital Product or not
    // calculate the multiplicand, multiplier, and product
    // eligible for pandigital
    public static boolean PandigitalProduct_1_9(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0 && isPandigital("" + n + i + n / i)) {
                System.out.print(n);
                System.out.print(i);
                System.out.println(n / i);
                return true;
            }
        }
        return false;
    }

    // To check the string formed from multiplicand
    // multiplier and product is pandigital
    public static boolean isPandigital(String str) {
        if (str.length() != 9)
            return false;
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch).equals("123456789");
    }

    // Driver function
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to print pandigit or not:");
        n = sc.nextInt();
        if (PandigitalProduct_1_9(n) == true) {
            System.out.println("yes");
        } else
            System.out.println("no");
    }
}
