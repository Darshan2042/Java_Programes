// Find the first digit.
// Find the last digit.
// Find the first and last digit.
public class FirstAndLastDigit {
    public void result(int num){
        int first = 0;
        int last = num % 10;
        while(num >= 10){
            num /= 10;
        }
        first = num % 10;
        System.out.println("First Digit of Given Number is: "+first);
        System.out.println("Last Digit of Given Number is: "+last);
        System.out.println("First Digit is This: "+first+"Last Digit is This: "+last);
    }
    public static void main(String args[]){
        FirstAndLastDigit obj = new FirstAndLastDigit();
        obj.result(488465468);
    }
}
