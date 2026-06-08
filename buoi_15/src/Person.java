public class Person {

	public String id;
	public String name;
	
	// public Person() {}

	public Person(String id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Person(id, name) is created");
	}
	
	public String getInfo() {
		return String.format("Person [id=%s, name=%s]", this.id, this.name);
	}

}