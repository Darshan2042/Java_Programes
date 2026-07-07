package String;

public class PalindromeString {
    public Boolean checkPalindromeString(String s){
        String org = s;
        char[]  s1 = s.toCharArray();
        int left = 0;
        int right = s1.length-1;
        while(left < right){
            char temp = s1[left];
            s1[left] = s1[right];
            s1[right] = temp;
            left++;
            right--;
        }
        String latest = new String(s1);
        return org.equals(latest);
    }

    public static void main(String args[]){
        PalindromeString ps = new PalindromeString();
        String s = "madam";
        boolean res = ps.checkPalindromeString(s);
        System.out.println(res); 
    }
    
}
