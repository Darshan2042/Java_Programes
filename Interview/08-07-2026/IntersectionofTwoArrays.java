import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionofTwoArrays {
    public ArrayList<Integer> common(int[] arr1 , int[] arr2){
        HashSet<Integer> list = new HashSet<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int num : arr1){
            list.add(num);
        }
        for(int num : arr2){
            if(list.contains(num)){
                list1.add(num);
            }
        }
        return list1;
    }
    public static void main(String args[]){
        IntersectionofTwoArrays i = new IntersectionofTwoArrays();
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {4,5,6,7,8,9};
        System.out.println(i.common(arr1 , arr2));
    }
}
