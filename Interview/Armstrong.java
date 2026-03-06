//Check if a number is an Armstrong number.
package Interview;

public class Armstrong{
    public static void main(String[]args){
        int n = 153;
        int org = n;
        int sum = 0;
        int digits =  String.valueOf(n).length();
        while(n>0){
            int digit = n % 10;
            sum += Math.pow(digit,digits);
            n = n / 10;
        }
        if(sum == org){
            System.out.println("The number is Armstrong Number: ");
        }
        else{
            System.out.println("The number is not Armstrong Number: ");
        }
    }
}
