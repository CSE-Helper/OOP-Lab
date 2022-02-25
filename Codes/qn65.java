class Storage{
    int i=0;
    boolean value=false;
    public synchronized void add(int i) throws InterruptedException {
        this.i=i;
        this.value=true;
    }
    public synchronized int display() throws InterruptedException {
        this.value=false;
        return i;
    }
}
class Counter extends Thread{
    Storage s;
    Counter(){}
    Counter(Storage s){this.s=s;}
    public void run() {
        for(int i=0 ;i<10;i++) {
            try {
                synchronized(s) {
                    while(s.value==true) {
                        s.wait();
                    }
                    s.add(i);
                    System.out.println("Added: "+i);
                    s.notifyAll();
                }
            } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            }
        }
    }
}
class Printer extends Thread{
    Storage s;
    Printer(){}
    Printer(Storage s){this.s=s;}
    public void run() {
        for(int i=0 ;i<10;i++) {
        try {
            synchronized(s) {
                while(s.value==false) {
                    s.wait();
                }
                System.out.println("Print: "+s.display());
                s.notifyAll();
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            }
        }
    }
}
public class qn65{
    public static void main(String arg[]) {
        Storage s1= new Storage();
        Counter c= new Counter(s1);
        Printer p = new Printer(s1);
        try {
            c.start();
            p.start();
        }
        catch(Exception E) {
            System.out.println(E);
        }
    }
}