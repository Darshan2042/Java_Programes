package OOP.MultiThreading.Runnable;

public class MainClass {
    public static void main(String args[]){
        writing w = new writing();
        reading r = new reading();
        listening l = new listening();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(l);
        t1.start();
        try{
            t1.join(5000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }

}
