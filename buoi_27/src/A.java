public class A {

	public static class B {
	
		public int valueB;
		
		public B(int valueB) {
			this.valueB = valueB;
		}
		
		public void greetingB() {
			System.out.println("From class B");
		}

        // public void testAccessToComponentsOfClassA() {
		// 	System.out.println(A.this.valueA);
		// 	A.this.greetingA();
		// }
	
	}
	
	public int valueA;
	
	public A(int valueA) {
		this.valueA = valueA;
	}
	
	public void greetingA() {
		System.out.println("From class A");
	}

    // public static void test() {
    //     System.out.println(this.valueA);
    //     this.greetingA();
    // }

}