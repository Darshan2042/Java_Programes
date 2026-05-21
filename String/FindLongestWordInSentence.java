package String;

public class FindLongestWordInSentence {
    public String maximumLengthWord(String s){
        String[] temp = s.split("\\s+");
        String s2 = "";
        for(int i=0 ;i<temp.length;i++){
            if(s2.length() < temp[i].length()){
                s2 = temp[i];
            }
        }
        return s2;
    }

    public static void main(String args[]){
        FindLongestWordInSentence flwi = new FindLongestWordInSentence();
        String s1 = "Hello my name is Darshan Pawar";
        System.out.println(flwi.maximumLengthWord(s1));
    }
    
}
