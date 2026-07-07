package Interview;

public class String_palindrome {
    public static void main(String[]args){
        String str = "madam";
        int fp = 0;
        int bp = str.length() -1;
        boolean ispalindrome = true;
        while(fp < bp){
            if (str.charAt(fp) != str.charAt(bp)){
                ispalindrome = false;
                break;
            }
            fp++;
            bp--;
        }
        if(ispalindrome){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }

    }
}
