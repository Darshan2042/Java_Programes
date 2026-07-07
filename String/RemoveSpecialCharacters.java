package String;

public class RemoveSpecialCharacters {
    public String removeSpecialChar(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch) || ch == ' '){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    
    public static void main(String args[]){
        RemoveSpecialCharacters rsc = new RemoveSpecialCharacters();
        String s = "Hel#@^lo si#@r th$^@is i#s Da@rsha$n pa($war ";
        System.out.println(rsc.removeSpecialChar(s));
    }
}
