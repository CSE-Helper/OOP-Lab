import java.util.*;
interface employee{
    public void getInput();
}

interface compensation{
    public double getIncentive( float period,float compensation);
}
class Manager implements employee ,compensation {

    String name;
    String number;
    String Designation;
    double Monthly_salary;
    float period,compensation;
    Scanner scan = new Scanner(System.in);
    @Override
    public double getIncentive(float p,float c) {
        double d=p*c;
        return d;
    }

    @Override
    public void getInput() {
        // TODO Auto-generated method stub
        System.out.println("\nEnter Manager Details");
        System.out.println("Enter Manager Name: ");
        this.name=scan.nextLine();
        System.out.println("Enter Manager Number: ");
        this.number=scan.nextLine();
        System.out.println("Enter Manager Designation: ");
        this.Designation=scan.nextLine();
        System.out.println("Enter Manager Monthly Salary: ");
        this.Monthly_salary=scan.nextDouble();
        System.out.println("\nEnter over time details:");
        System.out.println("Enter over time period:");
        this.period=scan.nextFloat();
        System.out.println("Enter over time compensation:");
        this.compensation=scan.nextFloat();
        System.out.println("Incentive Amount:"+getIncentive(this.period, this.compensation));
    }

    public void print(){
        System.out.println("\tManager Details");
        System.out.println("Manager Name: "+this.name);
        System.out.println("Manager Number: "+this.number);
        System.out.println("Manager Designation: "+this.Designation);
        System.out.println("Manager Monthly Salary: "+this.Monthly_salary);
        System.out.println("Incentive Amount:"+getIncentive(this.period, this.compensation));

    }
    
}
class Scientist implements employee ,compensation{

    String name;
    String number;
    String Designation;
    double Monthly_salary;
    float period,compensation;
    Scanner scan = new Scanner(System.in);
    @Override
    public double getIncentive(float p,float c) {
        // TODO Auto-generated method stub
        double d=p*c;
        return d;
    }

    @Override
    public void getInput() {
        // TODO Auto-generated method stub
        System.out.println("\nEnter Scientist Details");
        System.out.println("Enter Scientist Name: ");
        this.name=scan.nextLine();
        System.out.println("Enter Scientist Number: ");
        this.number=scan.nextLine();
        System.out.println("Enter Scientist Designation: ");
        this.Designation=scan.nextLine();
        System.out.println("Enter Scientist Monthly Salary: ");
        this.Monthly_salary=scan.nextDouble();
        System.out.println("\nEnter over time details:");
        System.out.println("Enter over time period:");
        this.period=scan.nextFloat();
        System.out.println("Enter over time compensation:");
        this.compensation=scan.nextFloat();
        System.out.println("Incentive Amount:"+getIncentive(this.period, this.compensation));
        
    }

    public void print(){
        System.out.println("\tScintist Details");
        System.out.println("Scientist Name: "+this.name);
        System.out.println("Scientist Number: "+this.number);
        System.out.println("Scientist Designation: "+this.Designation);
        System.out.println("Scientist Monthly Salary: "+this.Monthly_salary);
        System.out.println("Incentive Amount:"+getIncentive(this.period, this.compensation));

    }
    
}
class Laborer implements employee ,compensation{

    String name;
    String number;
    String Designation;
    double Monthly_salary;
    float period,compensation;
    Scanner scan = new Scanner(System.in);
    @Override
    public double getIncentive(float p,float c) {
        double d=p*c;
        return d;
    }

    @Override
    public void getInput() {
        // TODO Auto-generated method stub
        System.out.println("\nEnter Laborer Details");
        System.out.println("Enter Laborer Name: ");
        this.name=scan.nextLine();
        System.out.println("Enter Laborer Number: ");
        this.number=scan.nextLine();
        System.out.println("Enter Laborer Designation: ");
        this.Designation=scan.nextLine();
        System.out.println("Enter Laborer Monthly Salary: ");
        this.Monthly_salary=scan.nextDouble();
        System.out.println("\nEnter over time details:");
        System.out.println("Enter over time period:");
        this.period=scan.nextFloat();
        System.out.println("Enter over time compensation:");
        this.compensation=scan.nextFloat();
        System.out.println("Incentive Amount:"+getIncentive(this.period, this.compensation));
        
    }

    public void print(){
        System.out.println("\tLaborer Details");
        System.out.println("Laborer Name: "+this.name);
        System.out.println("Laborer Number: "+this.number);
        System.out.println("Laborer Designation: "+this.Designation);
        System.out.println("Laborer Monthly Salary: "+this.Monthly_salary);
        System.out.println("Incentive Amount:"+getIncentive(this.period, this.compensation));

    }
}


public class qn68 {

    public static void main(String arg[]){
        Manager manager = new Manager();
        Scientist scientist=new Scientist();
        Laborer laborer = new Laborer();

        manager.getInput();
        scientist.getInput();
        laborer.getInput();

        manager.print();
        scientist.print();
        laborer.print();

    }
    
}
