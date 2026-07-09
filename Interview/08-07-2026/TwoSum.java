import java.util.HashMap;
import java.util.Arrays;
public class TwoSum {
    public int[] sum(int[] arr , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            int comp = target - arr[i];
            if(map.containsKey(comp)){
                return new int[] {map.get(comp),i};   // add map.get(comp)
            }
            else{
                map.put(arr[i] , i);  // ths is Important concept  put arr[i] , i
            }
        }
        return new int[] {};
    }
    public static void main(String args[]){
        TwoSum t = new TwoSum();
        int[] arr = {15,78,25,62,5,245,25,125,623,32};
        int target = 67;
        int[] res = t.sum(arr, target);
        System.out.println(Arrays.toString(res));
    }
}
