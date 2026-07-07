package Student.Student;

public class ValidationMethods {

	public boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean isPalindrome(int num) {
		int org = num;
		int rev = 0;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		return org == rev;
	}

	public boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd(int num) {
		if (num % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
}
