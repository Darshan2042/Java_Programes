package Student.Student;

public class App {
	public static void main(String args[]) {
		NthNumber n = new NthNumber();
		int prime = n.getPrime(10);
		int palindrome = n.getPalindrome(20);
		int even = n.getEven(20);
		int odd = n.getOdd(20);
		System.out.println(prime);
		System.out.println(palindrome);
		System.out.println(even);
		System.out.println(odd);
	}
}
