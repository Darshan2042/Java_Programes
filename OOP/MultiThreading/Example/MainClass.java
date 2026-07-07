package OOP.MultiThreading.Example;

public class MainClass {
    public static void main(String args[]){
        Writing w = new Writing();
        Reading r = new Reading();
        Listening l = new Listening();
        w.start();
        r.start();
        l.start();
    }
}
