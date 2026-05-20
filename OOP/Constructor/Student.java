package OOP.Constructor;

public class Student {
    int id;
    String name;

    Student(int id , String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("Student id is = "+id+" Student name is = "+name);
    }

    public static void main(String args[]){
        Student s = new Student(12,"Rahul");
        s.display();
    }
}
