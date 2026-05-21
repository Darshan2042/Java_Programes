package String;

public class ReverseString {
    
    public String reverse(String s){
        char[] s1 = s.toCharArray();
        int l = 0;
        int r = s1.length-1;
        while(l < r){
            char temp = s1[l];
            s1[l] = s1[r];
            s1[r] = temp;
            r--;
            l++;
        }
        return new String(s1);

    }

    public String reverseUsingStringBuilder(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1 ; i >= 0 ; i--){
            char ch = s.charAt(i);
            sb.append(ch);
        }
        return new String(sb);
    }

    public String reverseStringUsingInbuild(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public static void main(String args[]){
        ReverseString rs = new ReverseString();
        String s = "Hello";
        System.out.println(rs.reverse(s));
        System.out.println(rs.reverseUsingStringBuilder(s));
        System.out.println(rs.reverseStringUsingInbuild(s));
    }

}
