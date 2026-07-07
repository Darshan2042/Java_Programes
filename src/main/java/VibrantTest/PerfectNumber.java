package VibrantTest;

import java.util.ArrayList;

public class PerfectNumber {
	private boolean isPerfect(int n) {
		int org = n;
		int sum = 0;
		for(int i=1 ; i<n ; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		return sum == org;
	}
	
	public ArrayList<Integer> PerfectNumberInRange(int l , int r){
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=l ; i<r ; i++) {
			if(isPerfect(i)) {
				arr.add(i);
			}
		}
		return arr;
	}
	public static void main(String args[]) {
		PerfectNumber p = new PerfectNumber();
		System.out.println(p.PerfectNumberInRange(1, 200));
		
		
		
	}
}
