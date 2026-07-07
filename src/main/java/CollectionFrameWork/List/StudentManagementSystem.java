package CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> students = new ArrayList<>();
		students.add("Darshan");
		students.add("Rohit");
		students.add("Amit");
		students.add("Priya");
		students.add("Neha");
		for(int i=0 ; i<students.size(); i++) {
			System.out.print(students.get(i)+" ");
		}
		System.out.println();
		System.out.print("Enter student name to search: ");
		String searchName = sc.next();
		if(students.contains(searchName)) {
			System.out.println("Search Found");
		}
		else {
			System.out.println("Search Not Found");
		}
		System.out.print("Enter student name to remove: ");
		String studentRemove = sc.next();
		if(students.contains(studentRemove)) {
			students.remove(studentRemove);
			System.out.println("Student Removed Successfully");
		}
		else {
			System.out.println("Student Not Found");
		}
		System.out.println("Updated Student List:");
		for(int i=0 ; i<students.size(); i++) {
			System.out.print(students.get(i)+" ");
		}
		System.out.println();
		System.out.print("Total Number of Students Is: ");
		int total = students.size();
		System.out.println(total);
		sc.close();
	}
}
