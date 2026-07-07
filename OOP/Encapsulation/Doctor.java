package OOP.Encapsulation;

class Doctor {
    private int id;
    private String name;
    private String specialization;
    private double salary;

    Doctor(int id, String name,String specialization, double salary) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString() {
        return id + " " + name + " " +
               specialization + " " + salary;
    }

     public static void main(String[] args) {

        Doctor d1 = new Doctor(101,"Rahul","Cardiologist",85000);
        System.out.println(d1.getName());
        d1.setSalary(90000);
        System.out.println(d1);
    }
}