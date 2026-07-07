package PracticeWorkSpace;
public class string{
    public static void main(String args[]){
        String s1 = "International";
        int vowels = 0;
        int consent = 0;
        s1 = s1.toLowerCase();
        for(int i=0 ; i<s1.length(); i++){
            char ch = s1.charAt(i);
            if(ch >= 'a' && ch <='z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u'){
                    vowels++;
                }
                else{
                    consent++;
                }
            }
        }
        System.out.println("vowels = "+vowels+" "+"consent = "+consent);
    }
}