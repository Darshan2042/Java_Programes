import java.util.HashSet;

public class RemoveDuplicateCharacters {
    public String free(String s){
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        RemoveDuplicateCharacters r = new RemoveDuplicateCharacters();
        String s = "Darshan Pawar";
        System.out.println(r.free(s));
    }
}
