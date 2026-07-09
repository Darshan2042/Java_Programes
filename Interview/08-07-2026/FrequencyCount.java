import java.util.HashMap;
import java.util.LinkedHashMap;

public class FrequencyCount {

    public String count(int[] arr){
        LinkedHashMap<Integer , Integer> map = new LinkedHashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            int curr = arr[i];
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        StringBuilder sb  = new StringBuilder();
        for (Integer key : map.keySet()) {
                sb.append(key)
                .append(" -> ")
                .append(map.get(key))
                .append("\n");
        }
        return sb.toString();
        
    }
    public static void main(String args[]){
        FrequencyCount f = new FrequencyCount();
        int[] arr = {45,78,24,45,78,78,78,12,45,24,24,15,45,78,58,69,66};
        System.out.println(f.count(arr));
    }
}
