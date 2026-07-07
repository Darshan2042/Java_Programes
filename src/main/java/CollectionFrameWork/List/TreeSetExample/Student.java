package CollectionFrameWork.List.TreeSetExample;

public class Student {
	private int id;
	private String name;
	private String location;
	private double marks;
	Student(int id, String name, String location, double marks) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.marks = marks;
	}
	void setId(int id) {
		this.id = id;
	}
	void setName(String name) {
		this.name = name;
	}
	void setLocation(String location) {
		this.location = location;
	}
	void setMarks(double marks) {
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public double getMarks() {
		return marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", location=" + location + ", marks=" + marks + "]";
	}
	
}
