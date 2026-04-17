class Main {
    static void printNumbers(int n) {
        if (n == 0) return;   // Base case
        
        printNumbers(n - 1);  // Recursive call
        System.out.println(n);
    }

    public static void main(String[] args) {
        printNumbers(5);
        System.out.println("Hello");
    }
}