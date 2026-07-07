public class divisible {
    public static void main(String args[]) {
        int num = 54654;
        if(num % 2 == 0 &&
           num % 3 == 0 &&
           num % 5 == 0 &&
           num % 9 == 0 &&
           num % 11 == 0){
            System.out.println("This number is divisible by 2, 3, 5, 9 and 11");
        }
        else{
            System.out.println("This number is Not divisible by 2, 3, 5, 9 and 11");
        }
    }
}