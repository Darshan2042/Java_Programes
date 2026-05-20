package OOP.Constructor;

public class Constructor {
    Constructor(){
        System.out.println("Constructor called..");
    }

    void m1(){
        System.out.println("Hello Boss 1..");
    }

    void m2(){
        System.out.println("Hello Boss 2 ..");
    }
    void m3(){
        System.out.println("Hello Boss 3 ..");
    }


    public static void main(String args[]){
        Constructor con = new Constructor();
        con.m1();
        con.m2();
        con.m3();
    }
}
