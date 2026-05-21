package String;

public class ConvertLowercasetoUppercase {
    public String convertToLowerCase (String s){
        String s1 = s.toLowerCase();
        return s1;
    }

    public String convertToUpperCase(String s){
        String s1 = s.toUpperCase();
        return s1;
    }

    public static void main(String args[]){
        ConvertLowercasetoUppercase clu = new ConvertLowercasetoUppercase();
        String s = "DARSHAN pawar";
        System.out.println(clu.convertToLowerCase(s));
        System.out.println(clu.convertToUpperCase(s));
    }
    
}
