public class SecondLargest {
    public int second(int num){
        int first = -1;
        int sec = -1;
        while(num != 0){
            int digit = num % 10;
            if(digit > first){
                sec  =first;
                first = digit;
            }
            else if(sec < digit && digit != first){
                sec = digit;
            }
            num /= 10;
        }
        return sec;
    }
    public static void main(String args[]){
        SecondLargest s = new SecondLargest();
        System.out.println(s.second(3484515));

    }
}
