package bai02;

public class Student {
    public String id;
    public String name;
    public int age;

    public Student(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String getInfor(){
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
