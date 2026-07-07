package PracticeWorkSpace;
class CheckArraySorted {
    public boolean isSorted(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        CheckArraySorted ch  = new CheckArraySorted();
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(ch.isSorted(arr, 0));
    }
}