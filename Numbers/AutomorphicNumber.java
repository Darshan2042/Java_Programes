import java.util.ArrayList;

public class AutomorphicNumber {
    public boolean isAutomorphic(int num) {
        int square = num * num;
        int temp = num;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        int divisor = 1;
        for (int i = 1; i <= digits; i++) {
            divisor *= 10;
        }
        return square % divisor == num;
    }

    public ArrayList<Integer> Range(int start , int end){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = start ; i<= end ; i++){
            if(isAutomorphic(i)){
                arr.add(i);
            }
        }
        return arr;
    }

    public int NthAutomorphicNumber(int n){
        int count = 0;
        int num = 0;
        while(count != n){
            num++;
            if(isAutomorphic(num)){
                count++;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        AutomorphicNumber obj = new AutomorphicNumber();
        System.out.println(obj.isAutomorphic(76));
        System.out.println(obj.Range(1,1000 ));
        System.out.println(obj.NthAutomorphicNumber(9));
    }
}
