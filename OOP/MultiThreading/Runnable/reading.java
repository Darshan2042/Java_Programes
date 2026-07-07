package OOP.MultiThreading.Runnable;

public class reading implements Runnable {
    public void bookreading(){
        for(int i=1 ; i<=5 ; i++){
            System.out.println("book reading");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public void run(){
        bookreading();
    }
    
}
