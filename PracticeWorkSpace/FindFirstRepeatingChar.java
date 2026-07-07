package PracticeWorkSpace;
import java.util.HashMap;
public class FindFirstRepeatingChar {
    public char Demo(String s){
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(s.lastIndexOf(ch) == s.indexOf(ch)){
                return ch;
            }
        }
        return '\0';
    }

    public char usingHashMap(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0 ; i<s.length() ;i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0 )+1);
        }
        for(int i=0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return '\0';
    }

    public char usingArray(String s1){
        int[] freq = new int[26];
        String s = s1.toLowerCase();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i=0 ; i<s.length() ;i++){
            char ch = s.charAt(i);
            if(freq[ch - 'a'] == 1 ){
                return ch;
            }
        }
        return '\0';
    }
    public static void main(String args[]){
        FindFirstRepeatingChar f = new FindFirstRepeatingChar();
        String s = "Darshan";
        System.out.println(f.Demo(s));
        System.out.println(f.usingHashMap(s));
        System.out.println(f.usingArray(s));
    }
    
}
