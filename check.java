public class check{
    public static void main(String args[]){
        int[] nums = {50,40,60,50,40,20,10};
        selectionSort(nums);
        for(int num:nums){
            System.out.print(num + " ");
        }
    }
    public static void selectionSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            int min_index = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] < nums[min_index]){
                    min_index = j;
                }
                int temp = nums[i];
                nums[i] = nums[min_index];
                nums[min_index] = temp;
            }
        }
    }
}