import java.util.Scanner;
import java.util.*;

public class numbertoword {
    public static void main(String args[])
	{
	    int n, num = 0;
	    /* Input number from user */
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any number to print in words: ");
	    n=sc.nextInt();
	    /* Store reverse of n in num */
	    while(n != 0)
	    {
	        num = (num * 10) + (n % 10);
	        n /= 10;
	    }

	    /* 
	     * Extract last digit of number and print corresponding digit in words
	     * till num becomes 0
	     */
	    while(num != 0)
	    {
	        switch(num % 10)
	        {
	            case 0: 
	                System.out.print("Zero ");
	                break;
	            case 1: 
	            	System.out.print("One ");
	                break;
	            case 2: 
	            	System.out.print("Two ");
	                break;
	            case 3: 
	            	System.out.print("Three ");
	                break;
	            case 4: 
	            	System.out.print("Four ");
	                break;
	            case 5: 
	            	System.out.print("Five ");
	                break;
	            case 6: 
	            	System.out.print("Six ");
	                break;
	            case 7: 
	            	System.out.print("Seven ");
	                break;
	            case 8: 
	            	System.out.print("Eight ");
	            	break;
	            case 9: 
	            	System.out.print("Nine ");
	                break;
	        }
	        
	        num = num / 10;
	    }
}
