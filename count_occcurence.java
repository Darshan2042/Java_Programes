import java.util.HashMap;
class count_occurence{
    public static void main(String args[]){
        String s = "educationnandn da";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
                if(!map.containsKey(ch)){
                    map.put(ch,1);
                }
                else{
                    map.put(ch,map.get(ch)+1);
                }
            }
        for (char ch : map.keySet()){
            if(map.get(ch) > 1){
                System.out.println(ch +"="+map.get(ch));
            }
        }

    }
}