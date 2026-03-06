public class Evenodd{
    public static void main(String[]args){
        int arr[] = {2,4,5,6,8,78,2,15,5};
        int even = 0;
        int odd = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even += 1;
            }
            else{
                odd += 1;
            }
        }
        System.out.println("Even Number are this: " +even);
        System.out.println("Odd Number are this: " + odd);
    }
}