import java.util.Scanner;

public class countOccurances {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("Enter the string:");
        input = sc.next();
        System.out.println("Enter the character to search:");
        char search;
        search = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == search)
                count++;
        }
        System.out.println("The Character '" + search + "' appears " + count + " times.");
    }
}
