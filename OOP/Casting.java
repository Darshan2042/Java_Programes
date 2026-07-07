package OOP;

public class Casting {
    void display(){
        System.out.println("Parent Class Casting");
    }
}

class Child extends Casting{
    void show(){
        System.out.println("Child Class Casting");
    }
}

class Child2 extends Casting{
    void demo(){
        System.out.println("Child2 Class Casting");
    }
}

class MainClass{
    public static void main(String args[]){

        // Direct child object
        Child2 c = new Child2();
        c.demo();

        // ---------------- UPCASTING ----------------
        Casting c1 = new Child();
        c1.display();

        Casting c2 = new Child2();
        c2.display();

        // ---------------- DOWNCASTING ----------------
        Child d1 = (Child)c1;
        d1.show();

        Child2 d2 = (Child2)c2;
        d2.demo();
    }
}