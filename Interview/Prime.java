package Interview;

public class Prime {
    public static void main(String[]args){
        int count = 0;
        int n = 17;
        for (int i=1;i<=n;i++){
            if(n%i==0){
                count += 1;
            }
        }
        if(count==2){
            System.out.println("This is Prime Number: ");
        }
        else{
            System.out.println("This is not Prime Number: ");
        }
    }
}
