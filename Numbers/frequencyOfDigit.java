import java.util.HashMap;
import java.util.Arrays;
public class frequencyOfDigit {
    public static void main(String args[]){
        frequencyOfDigit f = new frequencyOfDigit();
        int num = 5119841;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(num != 0){
            int digit = num % 10;
            map.put(digit,map.getOrDefault(digit, 0)+1);
            num /= 10;
        }
        System.out.println(map);
        int[] res = f.usingArray(5186484);
        System.out.println(Arrays.toString(res));
    }

    public int[] usingArray(int num){
        int[] freq = new int[10];
        while(num != 0){
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }
        return freq;
    } 
}
