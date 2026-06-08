public class Student_A1 extends Person {

	// public String id;
	// public String name;
	public double mathScores;
	public double physicsScores;
	public double englishScores;
	
	public Student_A1() {
		this("Unknown", "Unknown");
		System.out.println("Student_A1() is created");
	}

	public Student_A1(String id, String name) {
		super(id, name);
		System.out.println("Student_A1(id, name) is created");
	}
	
	public double getTotalScores() {
		return this.mathScores + this.physicsScores + this.englishScores;
	}

	@Override
	public String getInfo() {
		return String.format("Student_A1 [Person=%s, mathScores=%f, physicsScores=%f, englishScores=%f]",
		this.getInfo(), this.mathScores, this.physicsScores, this.englishScores);
	}

}