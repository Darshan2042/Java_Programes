package OOP.MultiThreading.Example;

public class Reading extends Thread{
    public void bookReading(){
        for(int i=0 ; i<=10 ; i++){
            System.out.println("Book Reading Processing....");
        }
    }

    public void run(){
        bookReading();
    }
    
}
