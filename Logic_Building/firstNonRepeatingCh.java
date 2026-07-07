package Logic_Building;

import java.util.HashMap;

public class firstNonRepeatingCh  {
    public static void main(String args[]){
        String s = "aabbccdd";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0 )+1);
        }
        System.out.println(map);
        boolean isvalid = false;
        for(char ch : s.toCharArray()){
            if(map.get(ch) == 1){
                isvalid = true;
                System.out.println("Fist Non-Repeating char is these = "+ch);
                break;
            }
        }
        if(!isvalid){
            System.out.println("#");
        }
    }
    
}
