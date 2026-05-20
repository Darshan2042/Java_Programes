package OOP;

class Parent{
    int a = 10;

    Parent(){
        System.out.println("Parent Constructor");
    }

    void show(){
        System.out.println("Parent Method");
    }
}

class Child extends Parent{
    int a = 20;

    Child(){
        super(); // calls parent constructor
        System.out.println("Child Constructor");
    }

    void display(){
        System.out.println("Child Variable : " + a);

        // using this keyword
        System.out.println("Current Class Variable using this : " + this.a);

        // using super keyword
        System.out.println("Parent Class Variable using super : " + super.a);

        this.show();   // current class can access inherited method
        super.show();  // calling parent class method
    }
}

public class ThisAndSuper{
    public static void main(String[] args){
        Child ch = new Child();
        ch.display();
    }
}