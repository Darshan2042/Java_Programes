import java.util.Arrays;
import java.util.HashMap;
public class water {
    public int maximumarea(int[] nums){
        int maxarea = 0;
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int length = right - left;
            int bridth = Math.min(nums[left] , nums[right]);
            int area = length * bridth;
            maxarea = Math.max(area, maxarea);
            if(nums[left] >nums[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return maxarea;
    }

    public void sorting(int[] nums){
        int left = 0;
        int mid = 0;
        int right = nums.length-1;
        while(mid <= right){
            if(nums[mid] == 0){
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                left++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[right];
                nums[right] = nums[mid];
                nums[mid] = temp;
                right--;
            }
        }
    }

    public int kadensalgo(int[] nums){
        int curr  = nums[0];
        int maxSum = nums[0];
        for(int i=1 ; i<nums.length ; i++){
            curr = Math.max(nums[i] , curr + nums[i]);
            maxSum = Math.max(maxSum,curr);
        }
        return maxSum;
    }

    public boolean palindrome(int num){
        if(num < 0){
            return false;
        }
        int org = num;
        int rev = 0;
        while(num > 0){
            int digit = num% 10;
            rev = rev*10+digit;
            num = num /10;
        }
        return org ==rev;
    }

    public String reverseString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0 ; i--){
            char ch = s.charAt(i);
            sb.append(ch);
        }
        return sb.toString();
    }

    public boolean isprime(int num){
        if(num < 2){
            return false;
        }
        for(int i=2 ; i*i<=num ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public void reverseArray(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public boolean anagram(String s , String t){
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            map1.put(ch,map1.getOrDefault(map1,0)+1);
        }

        for(int i=0 ; i<t.length() ; i++){
            char ch = t.charAt(i);
            map2.put(ch,map2.getOrDefault(map2,0)+1);
        }
        return map1.equals(map2);
    }

    public int factorail(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        water w = new water();
        int[] arr = {12,54,84,625,32,5,21,32,5,36,52,45,65};
        int[] arr2 = {0,2,1,0,2,0,1,0,2,0,1,0,2};
        int solution = w.maximumarea(arr);
        w.sorting(arr2);
        System.out.println(solution);
        System.out.println(Arrays.toString(arr2));
        System.out.println(w.kadensalgo(arr));
        int num = 1231;
        System.out.println(w.palindrome(num));
        String s = "Hello";
        System.out.println(w.reverseString(s));
        System.out.println(w.isprime(25));
        int[] rev = {10,20,30,50,20};
        w.reverseArray(rev);
        System.out.println(Arrays.toString(rev));
        String s1 = "listen";
        String t = "silent";
        System.out.println(w.anagram(s1, t));
        System.out.println(w.factorail(5));
    }
}
