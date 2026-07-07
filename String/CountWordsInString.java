package String;

public class CountWordsInString {
    public int counter(String s){
        String[] s1 = s.split("\\s+");
        int words = 0;
        for(int i=0 ; i<s1.length ; i++){
            words++;
        }
        return words;
    }

    public static void main(String args[]){
        CountWordsInString cws = new CountWordsInString();
        String s = "Hello This is Darshan pawar";
        System.out.println(cws.counter(s));
    }
    
}
