package OOP.Interface;

@FunctionalInterface
interface FunctionalInterfaces {
    void m1();
}

class Demo implements FunctionalInterfaces{
    public void m1(){
        System.out.println("Method Override Sucessfully..");
    }
}
class Mainclass{
    public static void main(String args[]){
        Demo d1 = new Demo();
        d1.m1();
    }
}