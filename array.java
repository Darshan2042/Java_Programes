public class array {
    public static void main(String args[]){
        int primes[] = new int[50];
        int count  =0;
        int num = 2;
        while(count <50){
            if(isprime(num)){
                primes[count] = num;
                count++;
            }
            num++;
        }
        for (int i = primes.length - 1; i >= 0; i--) {
             System.out.print(primes[i] + " ");
        }
    }
    public static boolean isprime(int n){
        if (n < 2) {
            return false;
        }
        for(int i=2 ;i*i <= n; i++){
            if (n % i ==0) {
                return false;
            }
        }
        return true;
    }
}
 