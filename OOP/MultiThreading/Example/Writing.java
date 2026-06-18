package OOP.MultiThreading.Example;

public class Writing extends Thread{
    public void bookWriting(){
        for(int i=0 ; i<=10 ; i++){
            System.out.println("Book Writing Processing....");
        }
    }

    public void run(){
        bookWriting();
    }
}
