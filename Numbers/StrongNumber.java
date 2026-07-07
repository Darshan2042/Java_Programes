import java.util.ArrayList;

public class StrongNumber {
    public int factor(int num){
        int fact = 1;
        for(int i=1 ;i<=num ; i++){
            fact *= i;
        }
        return fact;
    }
    public boolean isStrong(int num){
        int sum = 0;
        int org = num;
        while(num != 0){
            int digit = num % 10;
            int fact = factor(digit);
            sum += fact;
            num /= 10;
        }
        return org == sum;
    }

    public ArrayList<Integer> Range(int start , int end){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=start ; i<=end ; i++){
            if(isStrong(i)){
                arr.add(i);
            }
        }
        return arr;
    }

    public int NthStrongNumber(int n){
        int count = 0;
        int num = 0;
        while(count != n){
            num++;
            if(isStrong(num)){
                count++;
            }
        }
        return num;
    }

    public static void main(String args[]){
        StrongNumber s  = new StrongNumber();
        System.out.println(s.isStrong(145));
        System.out.println(s.Range(1,1000));
        System.out.println(s.NthStrongNumber(5));
    }
}
