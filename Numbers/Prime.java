import java.util.ArrayList;

public class Prime {
    public boolean isPrime(int n){
        if(n < 2) return false;
        for(int i=2 ; i*i<=n ; i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> primeInRange(int r, int l){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=r ; i<=l ; i++){
            if(isPrime(i)){
                arr.add(i);
            }
        }
        return arr;
    }

    public int specificprime(int n){
        int num =  0;
        int count = 0;
        while(count != n){
            num++;
            if(isPrime(num)){
                count++;
            }
        }
        return num;
    }

    public int countPrime(int start , int end){
        int count = 0;
        for(int i=start ; i<=end ; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }


    public static void main(String args[]){
        Prime p = new Prime();
        System.out.println("Prime Number is :"+p.isPrime(50));
        System.out.println("Prime Number is :"+p.primeInRange(100,150));
        System.out.println("Prime Number is : "+p.specificprime(5));
        System.out.println("Prime number Count is : "+p.countPrime(100,150 ));
    }
}
