package OOP;

abstract class RBI {
    public final double r= 4.5;
    protected final double CalculateSI(double p , int n){
        return (p*r*n)/100;
    }   
}

class SBI extends RBI{
    final double calSI(double p , int n){
        return CalculateSI(p,n);
    }
}

public class Abstraction{
    public static void main(String args[]){
        SBI s = new SBI();
        System.out.println(s.calSI(10000, 4));
    }
}