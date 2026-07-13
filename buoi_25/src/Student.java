public class Student {

	public String id;
	public String name;
	public int age;
	
	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("Student [id=%s, name=%s, age=%d]", this.id, this.name, this.age);
	}

    /**
     * Mục tiêu của hàm này dùng để so sánh `this` và `o`
     */
	// @Override
	// public int compareTo(Student o) {
    //     if (this.age > o.age) {
    //         return 1;
    //     } else if (this.age < o.age) {
    //         return -1;
    //     } else {
    //         return 0;
    //     }
	// }

}