package Logic_Building;

public class secondLargestElement {
    int getElement(int[] nums){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length; i++){
            if(first < nums[i]){
                second = first;
                first = nums[i];
            }
            else if(second < nums[i] && nums[i] != first){
                second = nums[i];
            }
        }
        if(second == Integer.MIN_VALUE){
            return -1;
        }
        return second;

    }

    public static void main(String args[]){
        secondLargestElement s = new secondLargestElement();
        int[] nums = {23,43,45,88};
        int result = s.getElement(nums);
        System.out.println(result);

    }
}
