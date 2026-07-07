package OOP;

class bark {
    int x = 10;
    void dog(){
        System.out.println("Dog is Barking");
    }
}
class meow extends bark{
    void cat(){
        System.out.println("Cat is cute");
    }
}
class shui extends meow{
    void ox(){
        int x = 50;
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class Inheritance{
    public static void main(String args[]){
        shui s1 = new shui();
        s1.dog();
        s1.cat();
        s1.ox();

    }
}