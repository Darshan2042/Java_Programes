package PracticeWorkSpace;
import java.util.*;
class mainClass{
    public static void main(String args[]){
        int[][] arr = {{10,25},{55,67},{70,61}};
        List<Integer> li = new ArrayList<>();
        // for(int[] row : arr){
        //     for(int num : row){
        //         li.add(num);
        //     }
        // }
        // System.out.println(li);

        for(int[] row : arr){
            for(int num : row){
                if(num % 2 ==0){
                    li.add(num);
                }
            }
        }
        System.out.println(li);
    }
}
