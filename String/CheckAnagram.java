package String;

import java.util.HashMap;

public class CheckAnagram {
    public boolean AnagramOrNot(String s , String t){
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0 )+1);
        }

         for(int i=0 ; i<t.length() ; i++){
            char ch = t.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0 )+1);
        }
        return map1.equals(map2);
    }

    public static void main(String args[]){
        CheckAnagram ca = new CheckAnagram();
        String s = "listen";
        String t = "slient";
        System.out.println(ca.AnagramOrNot(s,t));
    }
    
}
