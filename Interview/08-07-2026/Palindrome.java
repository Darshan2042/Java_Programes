public class Palindrome {
    public boolean checkNumber(int num){
        int rev = 0;
        int org = num;
        while(num > 0){
            int digit  = num % 10;
            rev = rev * 10 +digit;
            num /= 10;
        }
        return org == rev;
    }

    public boolean checkString(String s){
        String org = s;
        char[] ch = s.toCharArray();
        int low = 0;
        int high = ch.length -1;
        while(low < high){
            char temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            low++;
            high--;
        }
        String rev = new String(ch);
        return org.equals(rev);
    }
    public static void main(String args[]){
        Palindrome p = new Palindrome();
        int num = 12321;
        String s = "madam";
        System.out.println(num + " is Palindrome? " + p.checkNumber(num));
        System.out.println(s + " is a Palindrome? " + p.checkString(s)); 
    }
}
