public class FirstNonRepeatingCharacter {
    public char first(String s){
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                return ch;
            }
        }
        return 'O';
    }
    public static void main(String args[]){
        FirstNonRepeatingCharacter f = new FirstNonRepeatingCharacter();
        String s = "International";
        System.out.println(f.first(s));
    }
}
