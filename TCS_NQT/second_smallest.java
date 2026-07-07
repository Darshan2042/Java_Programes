package TCS_NQT;
public class second_smallest{
    public static void main(String args[]){
        int arr[] = {1,234,343,34,34,343,444,232};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }

            else if(arr[i] < secondSmallest && arr[i] != smallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println(secondSmallest);

    }
}