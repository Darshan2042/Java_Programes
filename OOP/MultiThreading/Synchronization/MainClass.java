public class MainClass {
    public static void main(String args[]){
        Site s = new Site();
        User u1 = new User(s);
        User u2 = new User(s);
        Thread t1 = new Thread(u1);
        Thread t2 = new Thread(u2);
        t1.setName("Rohit");
        t2.setName("Virat");
        t1.start();
        t2.start();
    }
    
}
