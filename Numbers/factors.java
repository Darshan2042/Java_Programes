import java.util.ArrayList;

public class factors {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        int num = 20;
        for(int i=1 ; i<=num ; i++){
            if(num % i == 0){
                arr.add(i);
            }
        }
        System.out.println(arr);
    }
}
