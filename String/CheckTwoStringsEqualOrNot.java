package String;

public class CheckTwoStringsEqualOrNot {
    public boolean checkString(String s1 , String s2){
        return s1.equals(s2);
    }

    public static void main(String args[]){
        CheckTwoStringsEqualOrNot cte = new CheckTwoStringsEqualOrNot();
        String s1 = "Hello Mr. Darshan";
        String s2 = "Hello Mr. Darshan";
        System.out.println(cte.checkString(s1, s2));
    }
    
}
