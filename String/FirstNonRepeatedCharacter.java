package String;

public class FirstNonRepeatedCharacter {
    public String nonRepeatedChar(String s){
        for(int i=0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                return String.valueOf(ch);
            }
        }
        return "null";
    }

    public static void main(String args[]){
        FirstNonRepeatedCharacter fnrc = new FirstNonRepeatedCharacter();
        String s1 = "Darshanpawarthissidehello";
        System.out.println(fnrc.nonRepeatedChar(s1)) ;
    }
}
