public class KadaneAlgorithm {
    public int maxsub(int[] arr){
        int curr = arr[0];
        int max = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            curr = Math.max(arr[i] , arr[i] + curr);
            max = Math.max(max , curr);
        }
        return max;
    }
    public static void main(String args[]){
        KadaneAlgorithm k = new KadaneAlgorithm();
        int[] arr = {45,21,45,52,52,478,25,26,25,15};
        System.out.println(k.maxsub(arr));
    }
}
