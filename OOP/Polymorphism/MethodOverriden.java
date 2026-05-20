package OOP.Polymorphism;

public class MethodOverriden {
    public void m1(){
        System.out.println("Hello Sarkar........");
    }
}

class child extends MethodOverriden{
    public void m1(){
        System.out.println("Hello Chote Sarkar......");
    }
}

class Main{
    public static void main(String args[]){
        child ch = new child();
        ch.m1();
    }
    
}
