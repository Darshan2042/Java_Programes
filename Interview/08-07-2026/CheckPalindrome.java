public class CheckPalindrome {
    public boolean check(String s){
        char[] arr = s.toCharArray();
        int st = 0;
        int end = arr.length-1;
        while(st < end){
            char temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<arr.length ; i++){
            sb.append(arr[i]);
        }
        return sb.toString().equals(s);
    }

    public boolean opti(String s){
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String args[]){
        CheckPalindrome c = new CheckPalindrome();
        String s = "madama";
        System.out.println(c.check(s));
        System.out.println(c.opti(s));
        
    }
}
