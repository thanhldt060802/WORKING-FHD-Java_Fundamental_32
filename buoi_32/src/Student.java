import java.util.Objects;

public class Student {

    private String id;
    private String name;
    private int age;
    private String className;
    private double avg;

    public Student(String id, String name, int age, String className, double avg) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.className = className;
        this.avg = avg;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getAvg() {
        return this.avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((Student)obj).id);
    }

    @Override
    public String toString() {
        return String.format("Student [id=%s, name=%s, age=%d, className=%s, avg=%f", this.id, this.name, this.age,
                this.className, this.avg);
    }

}