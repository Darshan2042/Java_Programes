package Interview;

public class nearestprimenumber {
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        else{
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
         return true;
    }

    public static void main(String args[]){
        int  num = 17;
        int lower = num-1;
        int higher = num+1;

        while(true){
            if(isprime(lower)){
                System.out.println("Nearest"+lower);
                break;
            }
            else if(isprime(higher)){
                System.out.println("Nearest"+lower);
                break;
            }
            lower--;
            higher++;
        }
    }

}
