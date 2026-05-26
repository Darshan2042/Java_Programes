package OOP.Interface;

interface car{
    int maxSpeed = 120;
    void color();
    void type();
    void cc();
}

class BMWCar implements car{
    int minSpeed = 60;
    public void color(){
        System.out.println("BMWCarAvailble in all the color");
    }
    public void type(){
        System.out.println("Suv");
    }
    public void cc(){
        System.out.println("5000 to 8000");
        System.out.println("minimum speed is = "+minSpeed+"Maximum speed is = "+maxSpeed);
    }
}

class HondaCar implements car{
    int minSpeed = 40;
    public void color(){
        System.out.println("HondaCar Availble in all the color");
    }
    public void type(){
        System.out.println("XUV");
    }
    public void cc(){
        System.out.println("1000 to 2000");
        System.out.println("minimum speed is = "+minSpeed+"Maximum speed is = "+maxSpeed);
    }
}

class ferrariCar implements car{
    int minSpeed = 90;
    public void color(){
        System.out.println("ferrariCar Availble in all the color");
    }
    public void type(){
        System.out.println("Sports");
    }
    public void cc(){
        System.out.println("10000 to 12000");
        System.out.println("minimum speed is = "+minSpeed+"Maximum speed is = "+maxSpeed);
    }
}

class mainclass{
    public static void main(String args[]){
        car c = new BMWCar();
        c.color();
        c.type();
        c.cc();
    }
}