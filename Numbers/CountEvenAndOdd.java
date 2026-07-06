public class CountEvenAndOdd {
    public static void main(String args[]){
        int n = 76248742;
        int evenSum = 0;
        int oddSum = 0;
        while(n != 0){
            int digit = n % 10;
            if(digit % 2 == 0){
                evenSum += digit;
            }
            else{
                oddSum +=digit;
            }
            n /= 10;
        }
        System.out.println("Even Digit Sum is : " + evenSum);
        System.out.println("Odd Digit Sum is : " + oddSum);
    }
}
