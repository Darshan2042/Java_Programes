import java.util.Arrays;
import java.util.HashSet;

public class Find_duplicate {

    // public int duplicateElement(int[] arr){
    //     int n = arr.length;
    //     int exprectes_sum = n*(n+1)/2;
    //     int actual_sum = 0;
    //     for(int i=0 ; i<arr.length ;i++){
    //         actual_sum += arr[i];
    //     }
    //     return exprectes_sum - actual_sum;
    // }

    public int usingSorting(int[] arr){
        Arrays.sort(arr);
        for(int i=0 ; i<arr.length-1 ; i++){
            if(arr[i] == arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

    public int usingTwoForLoop(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public int usingHashSet(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int num: arr){
            if(hs.contains(num)){
                return num;
            }
            else{
                hs.add(num);
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Find_duplicate fd = new Find_duplicate();
        int[] arr = {4,2,5,1,3,2};
        // System.out.println(fd.duplicateElement(arr));
        System.out.println(fd.usingSorting(arr));
        System.out.println(fd.usingTwoForLoop(arr));
        System.out.println(fd.usingHashSet(arr));
    }
    
}
