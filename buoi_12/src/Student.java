public class Student {

	public String id;
	public String name;
	public int age;
	
	public Student() {
		this("Unknown", "Unknown", -1);
        System.out.println("Constructor 1 is done");
	}
	
    public Student(String id) {
        this.id = id;
        System.out.println("Constructor 2 is done");
    }

	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
        System.out.println("Constructor 3 is done");
	}
	
    public Student copy() {
		Student newStudent = new Student(this.id, this.name, this.age);
		return newStudent;
	}

	public String getInfo() {
		return String.format("Student [id=%s, name=%s, age=%d]", this.id, this.name, this.age);
	}

}