public class SecondLargestElement{
    public int secondlargest(int[] arr){
        if(arr.length <= 1){
            return 0;
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > first){
                second = first;
                first = num;
            }
            else if(num > second && num != first){
                second  = num;
            }
        }
        if(second == Integer.MIN_VALUE){
            return -1;
        }
        return second;
    }
    public static void main(String args[]){
        SecondLargestElement s = new SecondLargestElement();
        int[] arr = {45,65,81,15,31,1,65,8,32,45,25,62,54};
        System.out.println(s.secondlargest(arr));
    }
}