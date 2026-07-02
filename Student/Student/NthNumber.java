package Student.Student;

public class NthNumber extends ValidationMethods {
	public int getPrime(int n) {
		int count = 0;
		int num = 0;
		while (count != n) {
			if (isPrime(num)) {
				count++;
			}
			num++;
		}
		return num - 1;
	}

	public int getPalindrome(int n) {
		int count = 0;
		int num = 0;
		while (count != n) {
			num++;
			if (isPalindrome(num)) {
				count++;
			}
		}
		return num;
	}

	public int getEven(int n) {
		int count = 0;
		int num = 0;
		while (count != n) {
			num++;
			if (isEven(num)) {
				count++;
			}
		}
		return num;
	}

	public int getOdd(int n) {
		int count = 0;
		int num = 0;
		while (count != n) {
			num++;
			if (isOdd(num)) {
				count++;
			}
		}
		return num;
	}
}
