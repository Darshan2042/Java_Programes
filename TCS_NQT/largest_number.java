package TCS_NQT;

public class largest_number {
    public static void main(String args[]){
        int arr[] = {1,234,343,34,34,343,444,232};
        int max_arr = arr[0];
        for(int  i = 0 ; i < arr.length;i++){
            if (arr[i] > max_arr) {
                max_arr = arr[i];
            }
        }
        System.out.println(max_arr);
    } 
}
