public class NumberPalindrome {
    public void check(int num){
        int org = num;
        int rev = 0;
        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if(rev == org){
            System.out.println("Number is Palindrome: "+org);
        }
        else{
            System.out.println("Number is Not Palindrome: "+org);
        }
    }
    public static void main(String args[]){
        NumberPalindrome np = new NumberPalindrome();
        np.check(11221);
    }
}
