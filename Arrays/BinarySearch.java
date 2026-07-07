package Arrays;

public class BinarySearch {
    public int bsearch(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }

    public int usingrecursion(int[] nums ,int low , int high , int target){
        if(low > high){
            return -1;
        }
        int mid = (low+high)/2;

        if(nums[mid] == target){
            return mid;
        }

        if(nums[mid] < target){
            return usingrecursion(nums,mid+1,high,target);
        }
        else{
            return usingrecursion(nums, low, mid-1, target);
        }
    }
    public static void main(String args[]){
        BinarySearch bs = new BinarySearch();
        int[] arr = {10,20,30,50,55,60};
        System.out.println(bs.bsearch(arr, 60));
        System.out.println(bs.usingrecursion(arr, 0, arr.length-1, 60));
    }
}
