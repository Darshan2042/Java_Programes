package String;

public class RemoveSpacesfromString {
    public String removeSpaces(String s){
        String[] s1 = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i < s1.length ; i++){
            sb.append(s1[i]);
        }
        return sb.toString();
    }

    public static void main(String args[]){
        RemoveSpacesfromString rs = new RemoveSpacesfromString();
        String s = "Hello Boss How are you ! ";
        System.out.println(rs.removeSpaces(s));
    }
    
}
