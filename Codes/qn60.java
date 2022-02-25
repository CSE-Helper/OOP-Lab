class Account{
    private double bal;
    private int accnum;
    
    Account(){}
    public Account(int a){
        bal=0.0;
        accnum=a;
    }
    
    public void deposit(double sum){
        if (sum>0){
            bal+=sum;
        }
        else System.err.println("Account.deposit(...): "+"cannot deposit negative amount.");
    
    }
    public void withdraw(double sum){
        if (sum>0) bal-=sum;
        else System.err.println("Account withdraw(...): "+"cannot withdraw negative amount.");
    
    }
    public double getAccountNumber()
    {
        return accnum;
    
    }
    public double getBalance(){
        return bal;
    }
    public String toString(){
        return "Acc "+accnum+": " + "balance ="+bal;
    }
    public final void print()
    {
        System.out.println(toString());
    }
}
class SavingsAccount extends Account{
    double interest=0.0;
    public SavingsAccount(double b,double i){
        super.deposit(b);
        interest=i;
    }
    public void setInterest(double n){
        interest=n;
        super.deposit(interest*100);
        System.out.println("After updating the interest rate");
        print();
    }
    public String toString(){
        return "Savings Account Balance = "+getBalance()+" Interest : "+interest;
    }
}
class CurrentAccount extends Account{
    double limit=0.0;
    public CurrentAccount(double b , double l){
        super.deposit(b);
        limit=l;
    }
    public void setLimit(double l){
        limit = l;
        System.out.println("After updating the withdrawn limit");
        print();
    }
    public String toString(){
        return "Current Account Balance = "+getBalance()+" Limit : "+limit;
    }
    public void withdraw(double num){
        System.out.println("Withdraw Rs. "+(int)num+" from Current Account");
        if(num<=limit){
            super.withdraw(num);
    
            print();
        }
        else System.out.println("Sorry, the limit is exceeded");
    }
}
class qn60{
    public static void main(String arg[]){
        Account a;
        a = new Account(1920102080);
        SavingsAccount b= new SavingsAccount(10000.0,0.25);
        CurrentAccount c = new CurrentAccount(20000.0,1000.0);
        b.print();
        c.print();
        b.setInterest(1.25);
        c.setLimit(2000.0);
        c.withdraw(1000);
        c.withdraw(1000);
        c.withdraw(3000);
        c.print();
    }
}