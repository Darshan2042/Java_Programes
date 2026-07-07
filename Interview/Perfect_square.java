//Check if a number is a perfect square.
package Interview;

public class Perfect_square {
    public static void main(String[]args){
        int n = 64;
        boolean isPerfect = false;
        for (int i=1;i<=n;i++){
            if(i*i==n){
                isPerfect = true;
                break;
            }
        }
        if(isPerfect == true){
            System.out.println("Number is a perfect Sqaure:"+n);
        }
        else{
            System.out.println("Number is not perfect Sqaure: "+n);
        }
    }
}
