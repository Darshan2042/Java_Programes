import java.util.ArrayList;
public class Fibonacci {
    public ArrayList<Integer> fab(int n){
        ArrayList<Integer> arr  =new ArrayList<>();
        int a = 0;
        int b = 1;
        for(int i=1 ; i<=n ; i++){
            arr.add(a);
            int c = a+ b;
            a = b;
            b =c;
        }
        return arr; 
    }

    public static void main(String args[]){
        Fibonacci f = new Fibonacci();
        System.out.println(f.fab(5));
    }
}
