package PracticeWorkSpace;
import java.util.ArrayList;

public class Prime {
    public boolean isprime(int n){
        if(n < 2){
            return false;
        }
        for(int i=2 ;i*i<=n ;i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }

    public int sumprime(int[] arr){
        int sum = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(isprime(arr[i])){
                sum +=arr[i];
            }
        }
        return sum;
    }

    public ArrayList<Integer> isPrimeRange(int s,int e){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=s ; i<=e ; i++){
            if(isprime(i)){
                arr.add(i);
            }
        }
        return arr;
    }

    public ArrayList<Integer> isPrimeupto(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        int num = 2;
        while(count < n){
            if(isprime(num)){
                arr.add(num);
                count++;
            }
            num++;
        }
        return arr;

    }

    public ArrayList<Integer> primeFactor(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=2 ; i<=num ;i++){
            while(num % i == 0){
            arr.add(i);
            num = num / i;
            }
        }
        return arr;
    }
    public static void main(String args[]){
        Prime p  = new Prime();
        // int s = 100;
        // int e = 150;
        int n = 100;
        // int[] num = {40,50,60,21,05,02,59, 61, 67, 71,40};
        System.out.println(p.primeFactor(n));
    }
}
