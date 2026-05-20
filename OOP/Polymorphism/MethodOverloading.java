package OOP.Polymorphism;

public class MethodOverloading {
    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int add(int a, int b){
        return a+b;
    }

    public static void main(String args[]){
        MethodOverloading m = new MethodOverloading();
        int r = m.add(10,20,30);
        int s = m.add(50,20);
        System.out.println(r);
        System.out.print(s);
    }
}
