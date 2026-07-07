package DSA.Vector;

public class MainClass {
	public static void main(String[] args) {
		MyVector v = new MyVector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println("Vector : " + v);
		System.out.println("Size : " + v.size());
		System.out.println("Capacity : " + v.capacity());
		System.out.println("Contains 30 : " + v.contains(30));
		System.out.println("Contains 100 : " + v.contains(100));
		System.out.println("Element at index 2 : " + v.get(2));
		v.set(2, 300);
		System.out.println("After set : " + v);
		v.insert(2, 25);
		System.out.println("After insert : " + v);
		v.remove(40);
		System.out.println("After remove(40) : " + v);
		System.out.println("Removed : " + v.removeAt(1));
		System.out.println("After removeAt : " + v);
		System.out.println("Index Of 300 : " + v.indexOf(300));
		v.add(300);
		System.out.println("After adding duplicate : " + v);
		System.out.println("Last Index Of 300 : " + v.lastIndexOf(300));
		System.out.println("First Element : " + v.firstElement());
		System.out.println("Last Element : " + v.lastElement());
		
		MyVector v2 = new MyVector();
		v2.add(100);
		v2.add(200);
		v2.add(300);
		v.addAll(v2);
		System.out.println("After addAll : " + v);
		v.clear();
		System.out.println("After clear : " + v);
		System.out.println("Is Empty : " + v.isEmpty());

	}
}