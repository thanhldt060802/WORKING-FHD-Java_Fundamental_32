import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // A objectA = new A(100);

        // System.out.println(objectA.valueA);
        // objectA.greetingA();

        // System.out.println();

        // A.B objectB = objectA.new B(200);
        
        // System.out.println(objectB.valueB);
        // objectB.greetingB();
        // objectB.testAccessToComponentsOfClassA();

        // A.B objectB = new A.B(200);
        
        // System.out.println(objectB.valueB);
        // objectB.greetingB();

        // A.test();

        // solveProblem();

        // Student[] arr = new Student[]{
        //     new Student("T", 29),
        //     new Student("A", 31),
        //     new Student("G", 24),
        // };

        // class StudentAgeComparator implements Comparator<Student> {

        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         return o1.age - o2.age;
        //     }

        // }

        // Arrays.sort(arr, new StudentAgeComparator());

        // for (Student s : arr) {
        //     System.out.println(s);
        // }

        // class Employee1 extends Employee {

        //     public double coefficientsSalary = 0.25;

        //     public Employee1(String id, String name, int salary) {
        //         super(id, name, salary);
        //     }

        //     @Override
		// 	public double calculateSalary() {
		// 		return super.salary + super.salary * this.coefficientsSalary;
		// 	}
			
		// 	@Override
		// 	public String toString() {
		// 		return String.format("Employee [id=%s, name=%s, salary=%d, coefficientsSalary=%f, calculateSalary=%f]",
		// 		super.id, super.name, super.salary, this.coefficientsSalary, this.calculateSalary());
		// 	}
            
        // }

        // Employee e = new Employee("001", "T", 500) {

        //     public double coefficientsSalary = 0.25;

        //     @Override
		// 	public double calculateSalary() {
		// 		return super.salary + super.salary * this.coefficientsSalary;
		// 	}
			
		// 	@Override
		// 	public String toString() {
		// 		return String.format("Employee [id=%s, name=%s, salary=%d, coefficientsSalary=%f, calculateSalary=%f]",
		// 		super.id, super.name, super.salary, this.coefficientsSalary, this.calculateSalary());
		// 	}
            
        // };

        // System.out.println(e);
        // System.out.println(e.calculateSalary());

        // Thread a = new Thread() {
        //     @Override
        //     public void run() {
        //         try {
        //             Thread.sleep(5000);
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //         System.out.println("Hello world");
        //     }
        // };

        // a.start();
        // System.out.println("End program!");

        Student[] arr = new Student[]{
            new Student("T", 29),
            new Student("A", 31),
            new Student("G", 24),
        };

        // Comparator<Student> c = new Comparator<Student>() {

        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         return o1.age - o2.age;
        //     }

        // };

        // Comparator<Student> c = (s1, s2) -> s1.age - s2.age;

        Arrays.sort(arr, (s1, s2) -> s1.age - s2.age);

        for (Student s : arr) {
            System.out.println(s);
        }

    }

    public static void solveProblem() {
		class B {
		
			public int value;
			
			public B(int value) {
				this.value = value;
			}
			
			public void greeting() {
				System.out.println("From class B!");
			}
		
		}
		
		B objectB = new B(-100);
		System.out.println(objectB.value);
		objectB.greeting();
	}

}
