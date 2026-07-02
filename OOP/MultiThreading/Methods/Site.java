package OOP.MultiThreading.Methods;

public class Site {
    public void doReservation(){
        Thread t = Thread.currentThread(); // CurrentThread Method............
        ThreadGroup tg = t.getThreadGroup();
        for(int i=1 ; i<=3 ; i++){
            System.out.println(t.getId() + "\t" +
                   t.getName() + "\t" +
                   tg.getName() + "\t" +
                   tg.getParent() + "\t" + 
                   "Reservation Processing..");
            
             Thread.yield();
        }
    }
}
