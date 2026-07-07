public class NeonNumber {
    public boolean isNeon(int num){
        int org = num;
        int temp = num * num;
        int sum = 0;
        while(temp != 0){
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        return org == sum;
    }
    public static void main(String args[]){
        NeonNumber n  = new NeonNumber();
        System.out.println(n.isNeon(120));
    }
}
