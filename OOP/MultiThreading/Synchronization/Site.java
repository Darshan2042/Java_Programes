public class Site {
    private boolean booked = false;
    synchronized  public void doReservation(){
        Thread t = Thread.currentThread();
        if(!booked){
            for(int i=1 ; i<4 ; i++){
                System.out.println(t.getName()+"\tReservation Processing");
            }
            booked = true;
            System.out.println(t.getName()+"\t Your Ticket Book Sucessfully..");
        }
        else{
            System.out.println("Sorry"+t.getName()+"Aap Nahi aa Sakte Bus se aao.... ");
        }
    }
}
