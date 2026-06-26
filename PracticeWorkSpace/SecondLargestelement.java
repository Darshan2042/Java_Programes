package PracticeWorkSpace;
public class SecondLargestelement {
    public static void main(String args[]){
        int[] arr = {10,20,3050,40,50,506,850,50,60,40,92};
        int first = arr[0];
        int second = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}
