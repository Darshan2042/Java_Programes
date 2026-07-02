package OOP.MultiThreading.Methods;

public class User implements Runnable {
    private Site s;
    User(Site s) {
        this.s = s;
    }
    User(){}
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Priority   : " + Thread.currentThread().getPriority());
        s.doReservation();
    }
}