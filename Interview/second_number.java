package Interview;

import javax.swing.text.StyledEditorKit;

public class second_number {

    public static void secondLarge(int[] arr){ 

        int lar = arr[0] ;
        int sec = arr[0] ;

        for(int i=0 ;i<arr.length ;i++){

            if(arr[i]>lar){
                lar = arr[i] ;
                sec = lar ;
            }
            if(arr[i]<lar  && arr[i]>sec){
                sec = arr[i] ;
            }
        }
     System.out.println(sec);

    }
    public static void main(String[] args) {
        int[] arr= {10,3,7,4,98};
        secondLarge(arr) ;
    }
    
}
