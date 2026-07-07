package PracticeWorkSpace;
class Demo {

    // Method that returns an integer
    int runCode(int num) {
        int max = num % 10;
        while( num > 0){
            int digit = num % 10;
            if(digit < max){
                max = digit;
            }
            num /= 10;
        }
        return max;
    }

    public static void main(String[] args) {

        // Create object of Demo class
        Demo obj = new Demo();

        // Call method using object
        int value = obj.runCode(1212342);

        // Print result
        System.out.println("Result: " + value);
    }
}