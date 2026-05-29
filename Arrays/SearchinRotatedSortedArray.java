package Arrays;

public class SearchinRotatedSortedArray {
    public int check(int[] nums , int target){
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target <= nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(target >= nums[mid] && target <= nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
        
    }
    public static void main(String args[]){
        SearchinRotatedSortedArray s = new SearchinRotatedSortedArray();
        int[] arr = {45,50,60,12,60,35};
        int target = 12;
        int res = s.check(arr,target);
        System.out.println(res);
    }
    
}
