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
        int count = 0;
        int n = 7;
        int target = 150;
        while(true){
            if(p1.checkPrime(n)){
                count++;
                if (count == target){
                    System.out.println("120th prime number is: "+n);
                    break;
                }
            }
            n++;
        }
        
    }
}