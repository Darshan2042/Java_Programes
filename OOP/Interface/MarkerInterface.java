package OOP.Interface;

interface MarkerInterface {
 
}

class DemoClass implements MarkerInterface{
    public void sample(){
        System.out.println("Hello");
    }
}

class Main{
    public static void main(String args[]){
        DemoClass d1 = new DemoClass();
        if(d1 instanceof MarkerInterface){        //This is most important line in the marker interface...
            System.out.println("object is marked.");
            d1.sample();
        }
        else{
            System.out.println("Object is not marked");
        }

    }
}