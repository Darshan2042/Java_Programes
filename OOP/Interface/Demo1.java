package OOP.Interface;

interface Demo1 {
    int a = 10;
    void m1();
}

class Demo2 implements Demo1{
    public void m1(){
        System.out.println("M1 Successfully Run"+a);
    }
}

// class main{
//     public static void main(String args[]){
//         Demo2 d1 = new Demo2();
//         d1.m1();
//     }
// }
