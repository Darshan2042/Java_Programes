package OOP.MultiThreading.Runnable;

public class writing implements Runnable{
    public void bookwriting(){
        for(int i=1 ; i<=5 ; i++){
            System.out.println("book writing");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public void run(){
        bookwriting();
    }
    
}
