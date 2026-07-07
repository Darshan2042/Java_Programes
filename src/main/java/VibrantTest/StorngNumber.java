package VibrantTest;

import java.util.ArrayList;

public class StorngNumber {
	private boolean isStrong(int n) {
		int sum = 0;
		int org = n;
		for(int i=1 ; i<=n ;i++) {
			if(n % i == 0) {
				sum *= i;
			}
		}
		return sum == org;
	}
	public ArrayList<Integer> strong(int l , int r){
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=l ; i<=r ; i++) {
			if(isStrong(i)) {
				arr.add(i);
			}
		}
		return arr;
	}
	public static void main(String args[]) {
		StorngNumber s = new StorngNumber();
		System.out.println(s.strong(1,200));
		
		
	}
}
