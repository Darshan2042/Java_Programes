import java.util.Arrays;
public class MoveZerosAtTheEnd {
    public void movezero(int[] arr){
        int j=0;
        for(int i=0; i<arr.length ; i++){
            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }
    public static void main(String args[]){
        MoveZerosAtTheEnd m = new MoveZerosAtTheEnd();
        int[] arr = {0,45,0,120,0,0,12,0,22,0,55,0,50,20,20,0,0};
        m.movezero(arr);
        System.out.println(Arrays.toString(arr));
    }
}
 