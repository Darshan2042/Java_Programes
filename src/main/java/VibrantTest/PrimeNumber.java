package VibrantTest;

import java.util.ArrayList;

public class PrimeNumber {
	public boolean isPrime(int n) {
		if(n < 2) {
			return false;
		}
		for(int i=2 ; i*i<=n ; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public ArrayList<Integer> PrimeNumberInRange(int L , int R){
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=L ; i<=R ; i++) {
			if(isPrime(i)) {
				arr.add(i);
			}
		}
		return arr;
	}
	
	public int CountPrime(int n ) {
		int count = 0;
		int num = 0;
		while(num != n ) {
			num++;
			if(isPrime(num)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		PrimeNumber p = new PrimeNumber();
		System.out.println(p.PrimeNumberInRange(1,200));
		System.out.println(p.CountPrime(150));
		

	}

}
