class Solution {
    public void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public void reverse(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(string args[]){
        Solution a = new Solution();
        int[] arr = {10,20,30,50,80,60,4,1,2};
        a.leftRotate(arr, 2);
    }
}