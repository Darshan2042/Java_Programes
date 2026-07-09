public class StringCompression {
    public String compression(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            int count = 0;
            while(i < s.length() && s.charAt(i) == ch){
                count++;
                i++;  //Important one
            }
            sb.append(ch);
            if(count == 1){
                continue;
            }else{
            sb.append(count);
            }
            i--;  // Important one
        }
        return sb.toString();
    }
    public static void main(String args[]){
        StringCompression sc = new StringCompression();
        String s = "aaabbcccdd";
        System.out.println(sc.compression(s));
    }
}
