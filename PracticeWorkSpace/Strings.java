package PracticeWorkSpace;
import java.util.HashMap;

public class Strings {
    public HashMap<Character, Integer>  count(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0 )+1);
        }
        return map;

    }

    public static void main(String args[]) {

        Strings d1 = new Strings();

        String s1 = "hellodarshan";

        System.out.println(d1.count(s1));
    }
    
}
