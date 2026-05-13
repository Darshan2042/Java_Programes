package OOP;

public class Encapsulation{
    private int amount;
    void withdraw(int a){
        amount -= a;
    }
    void deposite(int b){
        amount += b;
    }
    int display(){
        return amount;
    }
    public static void main(String args[]){
        Encapsulation s1 = new Encapsulation();
        s1.deposite(60);
        System.out.println(s1.display());
        s1.withdraw(50);
        System.out.println(s1.display());
    }
}