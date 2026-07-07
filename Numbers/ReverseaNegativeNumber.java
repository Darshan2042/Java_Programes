public class ReverseaNegativeNumber {
    public void reverse(int num){
        int sign = 1;
        int rev = 0;
        int org = num;
        if(num < 0){
            sign = -1;
            num = -num;
        }
        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num/10;
        }
        int cur = sign*rev;
        System.out.println("The Original NUmber is: "+org);
        System.out.println("The Reverse NUmber is: "+cur);

    }
    public static void main(String args[]){
        ReverseaNegativeNumber r = new ReverseaNegativeNumber();
        r.reverse(-12345);
    }
}
