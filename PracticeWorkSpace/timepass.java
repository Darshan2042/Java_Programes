// import java.util.Arrays;

public class timepass {

    public static void main(String args[]){
        String s = " sky is blue ";
        s = s.trim();
        String[] s1 = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i= s1.length-1 ; i >= 0 ; i--){
            sb.append(s1[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}