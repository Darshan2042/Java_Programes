package Recursion;

public class sumdigit {
    int sumDigit(int n){
        if (n==0){
            return 0;
        }
        return (n%10) + sumDigit(n/10);
    }
    
    public static void main(String args[]){
        sumdigit s1 = new sumdigit();
        System.out.println(s1.sumDigit(123));
    }
}
 