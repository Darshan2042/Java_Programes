package OOP.MultiThreading.Methods;

public class MainClass {
    public static void main(String args[]){
        Site s = new Site();
        User u1 = new User(s);
        User u2 = new User(s);
        User u3 = new User(s);
        User u4 = new User(s);
        ThreadGroup tg1 = new ThreadGroup("Batsmen");
        ThreadGroup tg2 = new ThreadGroup("Bolwing");
        ThreadGroup tg3 = new ThreadGroup("Common");
        ThreadGroup tg4 = new ThreadGroup("Filder");
        Thread t1 = new Thread(tg1,u1);
        Thread t2 = new Thread(tg2,u2);
        Thread t3 = new Thread(tg3,u3);
        Thread t4 = new Thread(tg4,u4);
        t1.setName("Rohit");
        t2.setName("Virat");
        t3.setName("Rahul");
        t4.setName("Hardik");
        t1.setPriority(3);
        t2.setPriority(6);
        t3.setPriority(4);
        t4.setPriority(1);
        System.out.println("Thread is Alive Or not: "+t1.isAlive());
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("Check Daemon: "+t1.isDaemon());
        System.out.println("Thread is Alive Or not: "+t1.isAlive());
        
    }
}
