package VibrantTest;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
	public int[] stock(int[] prices) {
		int n = prices.length;
		int[] ans = new int[n];
		Stack<Integer> stack = new Stack<>();
		for(int i=0 ; i<n ; i++) {
			while(!stack.isEmpty() && prices[stack.peek()] <= prices[i])
			{
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i] = i+1;
			}
			else {
				ans[i] = i-stack.peek();
			}
			stack.push(i);
		}
		return ans;
	}
	
	public static void main(String args[]) {
		StockSpan sp = new StockSpan();
		int[] arr = {100,80,70,50,60,10,50,60};
		int[] ans = sp.stock(arr);
		System.out.println(Arrays.toString(ans));
		
	}
	
}
