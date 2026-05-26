package OOP.Abstraction;
abstract class ATM {
    abstract void withdraw();
    abstract void deposit();
    void bankName() {
        System.out.println("Bank SBI");
    }
}

class UserATM extends ATM {
    void withdraw() {
        System.out.println("Money Withdraw");
    }
    void deposit() {
        System.out.println("Money Deposited");
    }
}

class Main {
    public static void main(String[] args) {
        UserATM a1 = new UserATM();
        a1.bankName();
        a1.withdraw();
        a1.deposit();
    }
}
