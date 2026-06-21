package TestJava;
public class ReverseWordsInSentence {
    public String reverseString(String s){
        char[] res = s.toCharArray();
        int low =0;
        int high = s.length()-1;
        while(low <= high){
            char ch = res[low];
            res[low] = res[high];
            res[high] = ch;
            low++;
            high--;
        }
        return new String(res);
    }
    public String reverseWord(String s){
        String[] res = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<res.length ; i++){
            sb.append(reverseString(res[i]));
            if(i != res.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public String longest(String s){
        String[] new_S = s.split(" ");
        String longest = "";
        for(String word : new_S){
            if(word.length() > longest.length()){
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String args[]){
        ReverseWordsInSentence r = new ReverseWordsInSentence();
        String s = "Hello Boss is this Darshan";
        System.out.println(r.reverseWord(s));
        System.out.println(r.longest(s));

    }
}
