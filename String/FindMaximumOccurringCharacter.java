package String;

import java.util.HashMap;

public class FindMaximumOccurringCharacter {
    public String maxChar(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max = 0;
        char ans = ' ';

        for(char key : map.keySet()){

            int freq = map.get(key);

            if(Math.max(max,freq) != max){

                max = freq;

                ans = key;
            }
        }

        return String.valueOf(ans);
    }

    public static void main(String args[]){

        FindMaximumOccurringCharacter fm =
                new FindMaximumOccurringCharacter();

        String s = "aaabbbbcc";

        System.out.println(fm.maxChar(s));
    }
}
