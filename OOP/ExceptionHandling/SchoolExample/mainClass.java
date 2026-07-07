package OOP.ExceptionHandling.SchoolExample;

import java.util.Scanner;

public class mainClass {
    public static void main(String args[]){
        System.out.println("Program Started..");
        System.out.println("\n\t\t==================================");
        System.out.println("\t\t   STUDENT REGISTRATION SYSTEM");
        System.out.println("\t\t==================================");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String Name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        Student s = new Student(id, Name, age, email, password);

        School school = new School();

        try{
            school.registration(s);
        }catch(InvalidAgeException e){
            System.out.println(e);
        }catch(InvalidNameException e){
            System.out.println(e);
        }catch(InvalidEmailException e){
            System.out.println(e);
        }catch(InvalidPasswordException e){
            System.out.println(e);
        }

        System.out.println("Program Eneded..");
    }
}
