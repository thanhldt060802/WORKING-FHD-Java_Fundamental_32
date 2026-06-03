public class Student {

	private String id;
	private String name;
	private int age;
	
	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Object get(String fieldName) {
		if(fieldName.equals("id")) {
			return this.id;
		} else if (fieldName.equals("name")) {
			return this.name;
		} else if (fieldName.equals("age")) {
			return this.age;
		} else {
			throw new RuntimeException("Truong du lieu khong hop le");
		}
	}
	
	public void set(String fieldName, Object newValue) {
		if(fieldName.equals("id")) {
			this.id = (String)newValue;
		} else if (fieldName.equals("name")) {
			this.name = (String)newValue;
		} else if (fieldName.equals("age")) {
			this.age = (Integer)newValue;
		}
	}
	
	public String getInfo() {
		return String.format("Student [id=%s, name=%s, age=%d]", this.id, this.name, this.age);
	}

}