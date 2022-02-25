import java.io.*;
import java.util.*;
class BankAccount{
    private String name;
    private int num;
    private double blns;
    BankAccount(String s , int n , double b){ 
        name=s ;
        num= n;
        blns = b;
    }
    public void display(){
        System.out.println("Account Holder Name: "+name);
        System.out.println("Account Balance: "+blns);
 
    }
    public void withdraw(double w){
        if(w>=blns){
            System.out.println("Error: Insufficient fund or Invalid amount!");
        }
        else{
            blns=blns-w;
        }
    }
    public void deposit(double d){
        blns = blns+d;
    }
}
class qn55{
    public static void main(String a[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("Please Enter an Account Number: ");
        int num = Integer.parseInt(obj.nextLine());
        System.out.print("please Enter the Account Holder Name: ");
        String name = obj.nextLine();
        System.out.print("Please Enter the Balance: ");
        double blns = Double.parseDouble(obj.nextLine());
        BankAccount acc = new BankAccount(name , num , blns);
        acc.display();
        acc.deposit(blns);
        acc.display();
        acc.withdraw(2*blns);
        acc.display();
        acc.withdraw(blns);
        acc.display();
        
    }
}
