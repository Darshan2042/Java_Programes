import java.util.HashSet;

public class FindDuplicateElements {
    public String find(int[] arr){
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        for(int curr : arr){
            if(!seen.add(curr)){
                if(set.add(curr)){
                    sb.append(curr).append('-');
                }
            }
        }
        if(sb.length() > 0){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
    public static void main(String args[]){
        FindDuplicateElements f = new FindDuplicateElements();
        int[] arr  = {45,78,24,45,78,78,78,12,45,24,24,15,45,78,58,69,66};;
        System.out.println(f.find(arr));
    }
}
