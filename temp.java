import java.util.HashMap;
class temp {
    public static void main(String args[]) {
        int[] arr = {10,20,50,43,45,3,4,3,4};
        int target = 46;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            if (map.containsKey(comp)) {
                int res = map.get(comp);
                System.out.println(res + " " + i);
                return;
            }
            map.put(arr[i], i);
        }
    }
}