import java.util.ArrayList;

public class HarshadNumber {
    public Boolean checknumber(int num){
        int sum = 0;
        int org = num;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return org % sum ==0;
    }

    public ArrayList<Integer> counter(int r){
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        int num = 1;
        while(count < r){
            if(checknumber(num)){
                arr.add(num);
                count++;
            }
            num++;
        }
        return arr;
    }

    

    public ArrayList<Integer> range(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1 ; i<=n ;i++){
            if(checknumber(i)){
                arr.add(i);
            }
        }
        return arr;
    }
    

    public static void main(String args[]){
        HarshadNumber hn = new HarshadNumber();
        int num = 100;
        System.out.println(hn.counter(num));
    }

}
