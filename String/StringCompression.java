package String;

public class StringCompression {
    public String charCount(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            int count  = 1;
            while(i+1 < s.length() &&
                  s.charAt(i) == s.charAt(i+1)){

                count++;
                i++;
            }
            sb.append(ch);
            sb.append(count);
        }
        return sb.toString();

    }

    public static void main(String args[]){
        StringCompression sc = new StringCompression();
        String s = "aaabbc";
        System.out.println(sc.charCount(s));
    }
    
}
