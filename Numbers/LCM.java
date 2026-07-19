public class LCM {
    public static void main(String args[]){
        LCM l = new LCM();
        int a = 20;
        int b = 40;
        int res = l.lcm(a,b);
        System.out.println(res);
    }

    public int lcm(int a , int b){
        int res = (a* b ) / gcd(a,b);
        return res;
    }

    private int gcd(int a , int b){
        if(b == 0){
            return a;
        }
        return gcd(b , a%b);
    }

}
