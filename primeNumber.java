public class primeNumber {
    boolean checkPrime(int n){
            if (n < 2) {
                return false;
            }
            for(int i = 2; i*i <= n; i++){
                if (n%i == 0) {
                    return false;
                }
            }
            return true;
        }
    public static void main(String args[]){
        primeNumber p1 = new primeNumber();
        
        int n = 7;
        System.out.println(p1.checkPrime(n));
        
    }
}