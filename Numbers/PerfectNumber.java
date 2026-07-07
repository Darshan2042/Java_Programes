import java.util.ArrayList;

public class PerfectNumber {
    public boolean isPerfect(int num){
        int org = num;
        int sum = 0;
        for(int i=1 ; i < num ; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum == org;
    }

    public ArrayList<Integer> Range(int start , int end){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=start ; i<=end ; i++){
            if(isPerfect(i)){
                arr.add(i);
            }
        }
        return arr;
    }

    public int NthPerfectNumber(int n){
        int count = 0;
        int num = 0;
        while(count != n){
            num++;
            if(isPerfect(num)){
                count++;
            }
        }
        return num;
    }
    public static void main(String args[]){
        PerfectNumber p = new PerfectNumber();
        System.out.println(p.isPerfect(496));
        System.out.println(p.Range(1,10000 ));
        System.out.println(p.NthPerfectNumber(5));
    }
}
