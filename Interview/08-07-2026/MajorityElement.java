import java.util.HashMap;
public class MajorityElement {
    public int ele(int[] arr){
        HashMap<Integer,Integer> map  = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            map.put(arr[i], map.getOrDefault(arr[i] , 0)+1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > arr.length / 2) {
                return key;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        MajorityElement m = new MajorityElement();
        int arr[] = {2,2,1,1,1,2,2};
        int num = m.ele(arr);
        System.out.println(num);
        
    }
}
