package String;

public class FindDuplicateCharacters {
    public String duplicateChar(String s){
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
        return sb2.toString();

    }

    public static void main(String args[]){
        FindDuplicateCharacters fdc = new FindDuplicateCharacters();
        String s1 = "hellomadamsir";
        System.out.println(fdc.duplicateChar(s1));

    }
}
