package Arrays;
public class ContainerWithMostWater {
    public int area(int[] nums){
        int low = 0;
        int max_area = 0;
        int high = nums.length-1;
        while(low < high){
            int l = high - low;
            int b = Math.min(nums[low] , nums[high]);
            int area = l * b;
            max_area = Math.max(area,max_area);
            if(nums[low] < nums[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return max_area;
    }
    public static void main(String args[]){
        ContainerWithMostWater c = new ContainerWithMostWater();
        int[] arr = {10,22,40,60,80,140,20,30,50,13};
        int res = c.area(arr);
        System.out.println(res);
    }
}
