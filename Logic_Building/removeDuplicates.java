package Logic_Building;

public class removeDuplicates {
    int removeDuplicatesFromArray(int nums[]){
        if(nums.length == 0){
            return 0;
        }
        int j = 1;
        for(int i=1 ; i< nums.length ; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

    }
    public static void main(String args[]){
        removeDuplicates r = new removeDuplicates();
        int[] arr = {1,1,2,2,3};
        System.out.println(r.removeDuplicatesFromArray(arr));
    }
    
}
