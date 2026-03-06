package TCS_NQT;

public class smallest_number {
    public static void main(String args[]){
    int arr[] = {23,2,23,34,34,34,434,343,4,3443,343};
    int min_array = arr[0];
    for(int i = 0; i < arr.length;i++){
        if (arr[i]<min_array) {
            min_array = arr[i];
        }
    }
    System.out.println(min_array);
}
}
