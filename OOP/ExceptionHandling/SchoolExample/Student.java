package OOP.ExceptionHandling.SchoolExample;

public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
    private String password;

    public Student(int id,String name , int age , String email , String password){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }

    public String toString(){
        return "Student[id="+id+",name="+name+",age="+age+",email="+email+"]";
    }

}
