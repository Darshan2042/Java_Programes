public class User implements Runnable {
    Site s = null;
    User(Site s){
        this.s = s;
    }
    public void run(){
        s.doReservation();
    }
}
