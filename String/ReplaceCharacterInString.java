package String;

public class ReplaceCharacterInString {
    public String replaceChar(String s, char oldChar, char newChar){
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == oldChar){
                sb.append(newChar);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public String inBuildMethod(String s , char oldChar ,char newChar){
        return s.replace(oldChar,newChar);
    }

    public static void main(String args[]){
        ReplaceCharacterInString rci = new ReplaceCharacterInString();
        String s1 = "banana";
        char oldChar = 'a';
        char newChar = 'o';
        System.out.println(rci.replaceChar(s1, oldChar, newChar));
        System.out.println(rci.inBuildMethod(s1, oldChar, newChar));
    }
    
}
