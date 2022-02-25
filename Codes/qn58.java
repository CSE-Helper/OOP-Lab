import java.util.Scanner;
public class qn58{
    public static void main(String arg[]){
       Scanner scan = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("Enter a number between 1 and 10");
            try{
                num= scan.nextInt();
                if (num < 1 || num>10){
                    System.out.println("\nIllegal value, "+ num +" entered. Please try again.");
                }
            }
            catch (Exception ime){
                System.out.println("Enter whole numbers only, with no spaces or other characters");
                scan.next();
            }
        }while(num<1 || num>10);
    
        System.out.println("\nValue correctly entered! Thank you.");
    }
}
