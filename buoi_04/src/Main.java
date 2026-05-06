import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // int a = 10;
        // a += 5;  // a = a + 5;
        // a <<= 2;  // a = a << 2;
        // System.out.println(a);

        // int a = 10;
        // int b = 10;
        // System.out.println(System.identityHashCode(a));
        // System.out.println(System.identityHashCode(b));
        // System.out.println(a == b);

        // Integer a = new Integer(10);
        // Integer b = new Integer(10);
        // System.out.println(System.identityHashCode(a));
        // System.out.println(System.identityHashCode(b));
        // System.out.println(a == b);

        // Integer a = -111;
        // Integer b = -111;
        // System.out.println(System.identityHashCode(a));
        // System.out.println(System.identityHashCode(b));
        // System.out.println(a == b);

        // int a = 200;
        // int b = 200;
        // System.out.println(System.identityHashCode(a));
        // System.out.println(System.identityHashCode(b));
        // System.out.println(a == b);

        // String pool
        // // String a = "ABC";
        // // String b = "ABC";
        // String a = new String("ABC");
        // String b = new String("ABC");
        // System.out.println(System.identityHashCode(a));
        // System.out.println(System.identityHashCode(b));
        // System.out.println(a == b);
        // System.out.println(a.equals(b));

        // Integer pool
        // int a = 200;
        // int b = 200;
        // System.out.println(System.identityHashCode(a));
        // System.out.println(System.identityHashCode(b));
        // System.out.println(a == b);

        // Integer a = 200;
        // Integer b = 200;
        // System.out.println(System.identityHashCode(a));
        // System.out.println(System.identityHashCode(b));
        // System.out.println(a == b);
        // System.out.println(a > b);

        // Integer a = new Integer(100);
        // Integer b = new Integer(100);
        // System.out.println(System.identityHashCode(a));
        // System.out.println(System.identityHashCode(b));
        // System.out.println(a == b);

        // Long a = 128L;
        // Long b = 128L;
        // System.out.println(System.identityHashCode(a));
        // System.out.println(System.identityHashCode(b));
        // System.out.println(a == b);

        // Double a = 3.0;
        // Double b = 3.0;
        // System.out.println(System.identityHashCode(a));
        // System.out.println(System.identityHashCode(b));
        // System.out.println(a == b);

        // int a = 20;
		// int b = 25;
		// // String result = a > b ? "Hello" : "World";
		// // System.out.println(result);
        // int result = a > b ? a : b;
        // System.out.println(result);

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a byte number: ");
		// byte a = sc.nextByte();
		// System.out.println("Your input: " + a);

        // System.out.print("Enter a word: ");
		// String a = sc.next();
		// System.out.println("Your input: " + a);

        // System.out.print("Enter a line: ");
		// String a = sc.nextLine();
		// System.out.println("Your input: " + a);

        // System.out.print("Enter a character: ");
        // char a = sc.nextLine().charAt(0);
        // System.out.println("Your input: " + a);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.printf("a = %d, b = %d, c = %d", a, b, c);

        // System.out.print("Enter your name: ");
		// String name = sc.nextLine();
		// System.out.print("Enter your age: ");
		// int age = sc.nextInt();
		// System.out.println(name + " is " + (age < 18 ? "young" : "old"));

        System.out.print("Enter your age: ");
		int age = sc.nextInt();
		sc.nextLine();  // Bỏ đi ký tự ẩn \0 từ lệnh nhập nextInt() phía trên
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.println(name + " is " + (age < 18 ? "young" : "old"));

        sc.close();

    }
    
}
