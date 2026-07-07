package CollectionFrameWork.List.TreeSetExample;

import java.util.Scanner;
import java.util.TreeSet;

public class MainClass {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Student> t = null;
		System.out.println("1.Sort based on ID ");
		System.out.println("2.Sort based on Name ");
		System.out.println("3.Sort based on Location ");
		System.out.println("4.Sort based on Marks ");
		while (true) {
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thank You");
				sc.close();
				return;
			case 1:
				t = new TreeSet<>(new IdComparator());
				break;
			case 2:
				t = new TreeSet<>(new NameComparator());
				break;
			case 3:
				t = new TreeSet<>(new LocationComparator());
				break;
			case 4:
				t = new TreeSet<>(new MarksComparator());
				break;
			default:
				System.out.println("Invalid Choice");
				continue;
			}

			t.add(new Student(19, "Darshan", "Pune", 50.20));
			t.add(new Student(13, "Vijay", "Surat", 80.60));
			t.add(new Student(43, "Vaibhav", "Nashik", 20.80));
			for (Student s : t) {
				System.out.println(s);
			}

		}
	}
}
