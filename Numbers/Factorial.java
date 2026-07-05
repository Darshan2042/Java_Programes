public class Factorial {
    public int factorialNumber(int n){
        int fact = 1;
        for(int i=1 ; i<=n ; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[]){
        Factorial f = new Factorial();
        System.out.println(f.factorialNumber(5));
    }
}

