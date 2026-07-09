public class ReverseWordsinString {
    public String reverse(String s){
        String[] arr = s.split(" ");
        int st = 0;
        int end = arr.length-1;
        while(st < end){
            String temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        StringBuilder sb = new StringBuilder();
        for(String word : arr){
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
        
    }
    public static void main(String args[]){
        ReverseWordsinString r = new ReverseWordsinString();
        String s = "Hello This Side Darshan Pawar";
        String res = r.reverse(s);
        System.out.println(res);
    }
}
