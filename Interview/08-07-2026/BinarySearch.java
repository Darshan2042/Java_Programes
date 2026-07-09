public class BinarySearch {
    public int bs(int[] arr , int target){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (high  +low)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(target < arr[mid]){
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        BinarySearch b = new BinarySearch();
        int[] arr = {10,50,60,70,85,95,100,152,300,502};
        int target = 152;
        System.out.println(target+" Element At this Position: "+b.bs(arr,target));
    }
}
