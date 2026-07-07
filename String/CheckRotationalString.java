package String;

public class CheckRotationalString {
    public Boolean checkString(String s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        String temp = s1+s1;   // Important step here concat same string twice.....
        if(temp.contains(s2)){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String args[]){
        CheckRotationalString crs = new CheckRotationalString();
        String s1 = "ABCD";
        String s2 = "CADB";
        System.out.println(crs.checkString(s1,s2));
    }
}
