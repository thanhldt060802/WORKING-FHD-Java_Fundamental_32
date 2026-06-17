import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Student s = new Student("", "Tan Thanh");
        // System.out.println(s);

        // Object a = "Le Dao Tan Thanh";
        // Object b = 10;
        // Object c = new Student(null, null);
        
        // Number a = new Integer(10);  // Object -> Number -> Integer
        // Object b = new Object(10); // Object

        // Employee e = new Manager(); // Object -> Employee -> Developer -> Manager
        // Manager m = new Employee(); // Object -> Employee
        // Developer d = new Employee(); // Object -> Employee
        // Manager m2 = new Developer(); // Object -> Employee -> Developer

        // Student_A1 s = new Student_A1();
        // Person p = new Student_A1();

        // Employee e;
		
		// e = new Employee();
		// e.calculateSalary();
		// e = new Technician();
		// e.calculateSalary();
		// e = new Developer();
		// e.calculateSalary();
		// e = new DevOps();
		// e.calculateSalary();
		// e = new Manager(); // Object -> Employee -> Developer -> Manager
		// e.calculateSalary();
		// e = new Designer();
		// e.calculateSalary();

        // Object obj = new Student("S01", "Tan Thanh"); // Object -> Student
        // System.out.println(obj);
        // System.out.println(obj.toString());

        Object obj = new Student_A1(); // Object -> Student -> Student_A1
        // Object obj = new String(); // Object -> String
        if (obj instanceof Student_A1) {
            ((Student_A1)obj).mathScores = 8.9;
            ((Student_A1)obj).englishScores = 7.9;
            ((Student_A1)obj).physicsScores = 9.8;
            System.out.println(((Student_A1)obj).getTotalScores());
        }

    }

    /**
     * handler x
     * if cond_1
     *      x = handler_1
     * else if cond_2
     *      x = handler_2
     * else 
     *      x = handler_3
     * 
     * x.do()
     * 
     * -----------------------------
     * 
     * handler
     * 
     * handler_1 extends handler
     *      step 1.1
     *      step 1.2
     *      step 1.3
     * 
     * handler_2 extends handler
     *      step 2.1
     *      step 2.2
     * 
     * handler_3 extends handler
     *      step 3.1
     *      step 3.2
     *      step 3.3
     *      step 3.4
     */
    
}
