package String;

import java.util.Arrays;

public class SortCharactersInString {
    public String sorting(String s){
        String s1 = s.toUpperCase();
        char[] temp = s1.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

    public static void main(String args[]){
        SortCharactersInString sci = new SortCharactersInString();
        String s1 = "International";
        System.out.println(sci.sorting(s1));
    }
}
