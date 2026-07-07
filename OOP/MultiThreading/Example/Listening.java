package OOP.MultiThreading.Example;

public class Listening extends Thread {
    public void MusicListening(){
        for(int i=0 ; i<=10 ; i++){
            System.out.println("Music Listening Processing....");
        }
    }

    public void run(){
        MusicListening();
    }
}
