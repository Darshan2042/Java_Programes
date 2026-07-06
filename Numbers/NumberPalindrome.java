import java.util.ArrayList;

public class NumberPalindrome {
    public boolean check(int num){
        int org = num;
        int rev = 0;
        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return org ==  rev;
    }

    public ArrayList<Integer> Range(int start, int end){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=start ; i <=end ; i++){
            if(check(i)){
                arr.add(i);
            }
        }
        return arr;

    }
    public static void main(String args[]){
        NumberPalindrome np = new NumberPalindrome();
        np.check(11221);
        System.out.println(np.Range(1,500));
    }
}
