import java.util.Arrays;
public class MergeTwoSortedArrays {
    public int[] merge(int[] arr1, int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int[] res = new int[m+n];
        int index = 0;
        int i=0;
        int j=0;
        while(i < m && j < n){
            if(arr1[i] < arr2[j]){
                res[index] = arr1[i];
                index++;
                i++;
            }
            else{
                res[index] = arr2[j];
                index++;
                j++;
            }
        }
        while(i < m){
            res[index] = arr1[i];
            index++;
            i++;
        }
        while(j < n){
            res[index] = arr2[j];
            index++;
            j++;
        }
        return res;
    }
    public static void main(String args[]){
        MergeTwoSortedArrays m = new MergeTwoSortedArrays();
        int[] arr1 = {20,40,60,80,85,95,96};
        int[] arr2 = {45,54,68,77,86,98};
        int[] res = m.merge(arr1 , arr2);
        System.out.println(Arrays.toString(res));
    }
}
