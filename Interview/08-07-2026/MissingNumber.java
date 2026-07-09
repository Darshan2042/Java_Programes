public class MissingNumber {
    public int miss(int[] arr){
        int xor = 0;
        for(int i=0 ; i<=arr.length ; i++){
            xor ^= i;
        }
        for(int num : arr){
            xor ^= num;
        }
        return xor;
    }
    public static void main(String args[]){
        MissingNumber m = new MissingNumber();
        int[] arr = {0,1,2,3,5,6,7,8,9};
        int res = m.miss(arr);
        System.out.println(res);

    }
}
