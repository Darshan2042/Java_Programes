public class SumOfDigits {
    public void add(int num){
        int org = num;
        int sum = 0;
        int count = 0;
        while(num != 0){
            sum += num % 10;
            count++;
            num /= 10;
        }
        System.out.println("Given Number is: "+org);
        System.out.println("Sum of Given Number is: "+sum);
        System.out.println("The Count of Number is: "+count);

    }
    public static void main(String args[]){
        SumOfDigits obj = new SumOfDigits();
        obj.add(123456);
    }
}
