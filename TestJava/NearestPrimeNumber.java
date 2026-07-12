import java.util.ArrayList;

public class NearestPrimeNumber {
    public boolean isPrime(int n){
        if(n < 2) return false;
        for(int i=2 ; i*i<=n ; i++){
            if(n % i == 0 ){
                return false;
            }
        }
        return true;
    }

    public int NearestPrime(int n){
        int left = n-1;
        int right = n+1;
        while(true){
            if(isPrime(n)){
                return n;
            }
            else{
                if(isPrime(left)){
                    return left;
                }

                if(isPrime(right)){
                    return right;
                }
            }
            left--;
            right++;

        }
    }

    public ArrayList<Integer> range(int start , int end){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = start ; i<=end ; i++){
            if(isPrime(i)){
                arr.add(i);
            }
        }
        return arr;
    }

    public int nthPrime(int n){
        int count = 0;
        int num = 0;
        while(count != n){
            num++;
            if(isPrime(num)){
                count++;
            }
        }
        return num;
    }

    public int smallPrime(int n){
        int left = n-1;
        while(left > 0){
            if(isPrime(left)){
                return left;
            }
            left--;
        }
        return -1;
    }

    public int largePrime(int n){
        int right = n+1;
        while(true){
            if(isPrime(right)){
                return right;
            }
            right++;
        }
    }

    public ArrayList<Integer> primeFactor(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1 ; i<=n ; i++){
            if(n % i == 0){
                if(isPrime(i)){
                    arr.add(i);
                }
            }
        }
        return arr;
    }
    public static void main(String args[]){
        NearestPrimeNumber n = new NearestPrimeNumber();
        System.out.println(n.NearestPrime(20));
        System.out.println(n.range(1, 100));
        System.out.println(n.nthPrime(5));
        System.out.println(n.smallPrime(40));
        System.out.println(n.largePrime(40));
        System.out.println(n.primeFactor(57));
    }
}
