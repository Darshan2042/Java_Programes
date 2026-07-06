import java.util.ArrayList;

public class ArmstrongNumber {
    public boolean isArmstrongNumber(int n){
        int pow = 0;
        int org = n;
        int temp = n;
        int sum = 0;
        while(n != 0){
            pow++;
            n /= 10;
        }
        while(temp !=0){
            int digit = temp % 10 ;
            sum += (int)Math.pow(digit,pow);
            temp /= 10;
        }
        return sum == org;
    }

    public ArrayList<Integer> range(int start , int end){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=start ; i<=end ; i++){
            if(isArmstrongNumber(i)){
                arr.add(i);
            }
        }
        return arr;
    }

    public int nthArmstrongNumber(int n){
        int num = 0;
        int count = 0;
        while(count != n){
            num++;
            if(isArmstrongNumber(num)){
                count++;
                // System.out.println(num);
            }
        }
        return num;
    }
    public static void main(String args[]){
        ArmstrongNumber a = new ArmstrongNumber();
        System.out.println(a.isArmstrongNumber(1634));
        System.out.println(a.range(1,1000));
        System.out.println(a.nthArmstrongNumber(15));
    }
}

