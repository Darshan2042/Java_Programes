// Find the largest digit.
// Find the smallest digit.
public class LargestAndSmallest {
    public void result(int num){
        int largest = 0;
        int smallest = 9;
        while(num != 0){
            int digit = num % 10;
            if(largest < digit){
                largest = digit;
            }
            if(smallest > digit){
                smallest = digit;
            }

            num /= 10;
        }
        System.out.println("Largest Element is: "+largest);
        System.out.println("Smallest Element is: "+smallest);
    }
    public static void main(String args[]){
        LargestAndSmallest obj = new LargestAndSmallest();
        obj.result(982687644);
    }
}
