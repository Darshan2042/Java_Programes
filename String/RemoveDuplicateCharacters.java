package String;

public class RemoveDuplicateCharacters {
    public String uniqueEle(String s){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(sb1.toString().contains(String.valueOf(ch))){
                sb2.append(ch);
            }
            else{
                sb1.append(ch);
            }
        }
        return sb1.toString();
    }

    public static void main(String args[]){
        RemoveDuplicateCharacters rdc = new RemoveDuplicateCharacters();
        String s = "Hellosirthisisdarshan";
        System.out.println(rdc.uniqueEle(s));
    }
}
