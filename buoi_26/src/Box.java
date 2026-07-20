public class Box<T extends Number> { // Box<T> <=> Box<T extends Object>

	private T value;
	
	public Box(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return this.value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}

    // public <E> boolean equalsByValue(E otherValue) {
	// 	return this.value.equals(otherValue);
	// }

    // public <T> boolean equalsByValue(T otherValue) {
	// 	return this.value.equals(otherValue);
	// }

    public static <T> void test(T obj) {

    }
	
	@Override
	public String toString() {
		return String.format("Box [instanceType=%s, value=%s]", this.value.getClass().getSimpleName(), this.value);
	}

}