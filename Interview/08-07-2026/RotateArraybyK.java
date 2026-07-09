import java.util.Arrays;
public class RotateArraybyK {
    public void rotate(int[] arr , int k){
        int n = arr.length;
        k = k % n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public void reverse(int[] arr , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        RotateArraybyK r = new RotateArraybyK();
        int[] arr = {45,21,45,1,47,58,696,3,45,21,25};
        int k = 4;
        r.rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
