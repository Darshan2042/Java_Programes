package TestJava;

public class NthPrimeNumber {
    
    private boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i=2 ; i*i<=n ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public int nthPrime(int n){
        int count = 0;
        int num = 2;
        while(true){
            if(isPrime(num)){
                count++;
                if(count == n){
                    return num;
                }
            }
            num++;
        }
    }

    public int countPrime(int start , int end){
        int count =0;
        for(int i=start ; i<=end ; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        NthPrimeNumber n = new NthPrimeNumber();
        int res = n.nthPrime(5);
        System.out.println(n.countPrime(100, 150));
        System.out.println(res);

    }
}
