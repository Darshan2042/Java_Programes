package TestJava;
import java.util.*;
public class StringPractice {
    public static void main(String args[]){
        StringPractice c = new StringPractice();
        String s = "Darshan";
        String s1 = "Darshan";
        char target = 'a';
        int count = 0;
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == target){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(c.firstNonRepatingchar(s1));
        System.out.println(c.firstNonRepatingcharUsingHashMap(s1));
        System.out.println(c.FirstRepeatingCharacter(s1));
        System.out.println(c.CountFrequencyofCharacters(s1));
        System.out.println(c.FindDuplicateCharacters("madamas"));
        System.out.println(c.checkAnagram("silent","listen"));
        c.CountVowelsandConsonants(s1);
        c.reverseString("Darshan");
        c.reverseStringUsingTwoPointer("Darshan");
        c.checkPalindrome("madam");
        c.MaximumOccurringCharacter("International");
        c.RemoveDuplicateCharacters("Darshan");
        c.CharacterSort("banana");
        c.CountWordsinaSentence("Hello My Name is Darshan Pawar, Hello This is Darshan pawar");
        c.FindLongestWordinaSentence("Hello My Name is Darshan Pawar, Hello This is Darshan pawar International");
        c.reversewordsinString("Darshan Pawar");
        c.CompressString("aaabbcc");
        c.checkrotation("ABCD", "CDAC");
    }

    public char firstNonRepatingchar(String s){
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                return ch;
            }
        }
        return 'O';
    }
    


    public char firstNonRepatingcharUsingHashMap(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return 'O';
    }

    public char FirstRepeatingCharacter(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        } 
        for(int i =0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(map.get(ch) == 2){
                return ch;
            }
        }
        return 'O';
    }

    public HashMap<Character,Integer> CountFrequencyofCharacters(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return map;
    }

    public HashSet<Character> FindDuplicateCharacters(String s){
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> set1 = new HashSet<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                set1.add(ch);
            }
            else{
                set.add(ch);
            }
        }
        return set1;
    }

    public boolean checkAnagram(String s , String t){
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0 ; i<t.length() ; i++){
            char ch = t.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        return map.equals(map1);
    }

    public void CountVowelsandConsonants(String s){
        int vow = 0;
        int con = 0;
        String s1 = s.toLowerCase();
        for(int i=0 ; i<s1.length() ; i++){
            char ch = s1.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u'){
                vow++;
            }
            else{
                con++;
            }
        }
        System.out.println("vowles in the String= " + vow);
        System.out.println("Consonants in the String= " + con);
    }
    

    public void reverseString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1 ; i>=0 ; i--){
            char ch = s.charAt(i);
            sb.append(ch);
        }
        System.out.println(sb);
    }

    public void reverseStringUsingTwoPointer(String s){
        String org =s;
        char[] arr = s.toCharArray();
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        String new_s = new String(arr);
        System.out.println("Original String is = " + org );
        System.out.println("Reverse String is = "+new_s);
    }

    public void checkPalindrome(String s){
        String org = s;
        char[] arr = s.toCharArray();
        int low = 0 ;
        int high = arr.length-1;
        while(low <= high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        String new_S = new String(arr);
        if(org.equals(new_S)){
            System.out.println("isPalindrome");
        }
        else{
            System.out.println("isNotPalindrome");
        }
    }


    public void MaximumOccurringCharacter(String s){
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch  = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int frq = 0;
        char res = 'O';
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(map.get(ch) > frq){
                frq = map.get(ch);
                res =ch;
            }
        }
        System.out.println("MaximumOccurringCharacter is = "+ res);
    }

    public void RemoveDuplicateCharacters(String s){
        StringBuilder sb  = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                sb.append(ch);
                set.add(ch);
            }
        }
        String new_S = new String(sb);
        System.out.println("New String is = "+new_S);
    }

    public void CharacterSort(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String new_S = new String(arr);
        System.out.println("Sorted String is = "+new_S);
    }

    public void CountWordsinaSentence(String s){
        String[] arr = s.split(" ");
        System.out.println("Count of Words is = "+arr.length);

    }

    public void FindLongestWordinaSentence(String s){
        String[] arr = s.split(" ");
        String longest = "";
        for(String word : arr){
            if(word.length() > longest.length()){
                longest = word;
            }
        }
        System.out.println("Longest word in A String is = "+longest);
    }

    public void reversewordsinString(String s){
        StringBuilder sb = new StringBuilder();
        String[] arr  = s.split(" ");
        for(String word : arr){
            char[] nums = word.toCharArray();
            int low = 0;
            int high = nums.length-1;
            while(low <= high){
                char temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
            }
            String new_sb = new String(nums);
            sb.append(new_sb);
            sb.append("");
        }
        System.out.println(sb);
    }

    public void CompressString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(s.indexOf(ch) != i){
                continue;
            }
            int count = 0;
            for(int j=0 ; j<s.length();j++){
                char ch2 = s.charAt(j);
                if(ch == ch2){
                    count++;
                }
            }
            sb.append(ch);
            sb.append(count);
        }
        System.out.println(sb);
    }

    public void checkrotation(String s1 ,String s2){
        if((s1+s1).contains(s2)){
            System.out.println("Yes String is Rotation");
        }
        else{
            System.out.println("No String is Not Rotation");
        }
    }
}
