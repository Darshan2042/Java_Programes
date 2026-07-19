public class GCD {
    public static void main(String args[]){
        int a = 15;
        int b = 30;
        GCD g = new GCD();
        int res = g.gcd(a, b);
        System.out.println(res);
    }

    public int gcd(int a , int b){
        if(b == 0){
            return a;
        }
        return gcd(a,a%b);
    }
}
