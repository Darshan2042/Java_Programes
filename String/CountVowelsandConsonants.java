package String;

public class CountVowelsandConsonants {
    public void counter(String s1){
        String s = s1.toLowerCase();
        int vowels = 0;
        int cons = 0;
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
                vowels++;
            }else{
                cons++;
            }
        }
        System.out.println("Count of vowels is " + vowels);
        System.out.println("count of cons is  " + cons);
    }

    public static void main(String args[]){
        CountVowelsandConsonants cvc = new CountVowelsandConsonants();
        String s = "wejnfhiwbfuwefhwfbw";
        cvc.counter(s);
    }
    
}
