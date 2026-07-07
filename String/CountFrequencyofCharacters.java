package String;

import java.util.HashMap;

public class CountFrequencyofCharacters {
    public HashMap<Character,Integer> counter(String s){
        HashMap<Character,Integer> map  = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0 )+1);
        }
        return map;
    }

    public static void main(String args[]){
        CountFrequencyofCharacters cfc = new CountFrequencyofCharacters();
        String s = "aeubfljnfndf";
        System.out.println(cfc.counter(s));
    }
    
}
