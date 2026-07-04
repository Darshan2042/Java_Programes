public class ReverseNumber {
    public void reverse(int num){
        int rev = 0;
        int org = num;
        while(num > 0){
            int digit = num % 10;
            rev = rev *10+ digit;
            num = num / 10;
        }
        System.out.println("Original Number Is: "+org);
        System.out.println("Reverse Number Is: "+rev);
    }
    public static void main(String args[]){
        ReverseNumber r = new ReverseNumber();
        r.reverse(1452);
    }
}
