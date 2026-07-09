public class LongestCommonPrefix {
    public String prefix(String[] arr){
        if(arr.length == 0){
            return "";
        }
        String pre = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            int j=0;
            String curr = arr[i];
            while(j < pre.length() && j < curr.length() && pre.charAt(j) == curr.charAt(j)){
                j++;
            }
            pre = pre.substring(0,j);
        }
        return pre;
    }
    public static void main(String args[]){
        LongestCommonPrefix l = new LongestCommonPrefix();
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(l.prefix(arr));

    }
}
