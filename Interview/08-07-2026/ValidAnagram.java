public class ValidAnagram {
    public boolean check(String s , String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] alpha = new int[26];
        for(int i=0 ; i<s.length() ; i++){
            alpha[s.charAt(i) - 'a']++;
        }
        for(int i=0 ; i<t.length() ; i++){
            alpha[t.charAt(i) - 'a']--;
        }
        for(int count : alpha){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        ValidAnagram v = new ValidAnagram();
        String s = "slient";
        String t = "listen";
        System.out.println(v.check(s,t));

    }
}
