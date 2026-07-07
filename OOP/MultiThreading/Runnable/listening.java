package OOP.MultiThreading.Runnable;

public class listening implements Runnable {
    public void musiclistening(){
        for(int i=1 ; i<=5 ; i++){
            System.out.println("Music listening");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public void run(){
        musiclistening();
    }
}
