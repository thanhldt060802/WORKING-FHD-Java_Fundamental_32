import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        // ArrayList<String> list = new ArrayList<>();
        // list.add(new String("Python"));
        // list.add("Java");
        // list.add("C");
        // list.add("Rust");
        // list.add("Ruby");
        // list.add("Matlab");

        // System.out.println(list);

        // list.remove(new String("Python"));
        // System.out.println(list);

        // ArrayList<Student> students = new ArrayList<Student>();
		// students.add(new Student("S01", "A", 19));
		// students.add(new Student("S02", "B", 25));
		// students.add(new Student("S03", "C", 23));

		// for(Student s : students) {
		// 	System.out.println(s);
		// }
		
		// System.out.println();

        // // Student stu = new Student("S02");
		// // // System.out.println("Delete: " + students.remove(stu));
		// // for(Student s : students) {
		// // 	System.out.println(s);
		// // }

        // // System.out.println(students.get(1).equals(stu));
        // // System.out.println(stu.equals(stu));

        // Student stu = new Student("S03");
        // System.out.println(students.indexOf(stu));
        // System.out.println(students.contains(stu));

        // ArrayList<String> list = new ArrayList<>();

        // LinkedList<String> ll = new LinkedList<>();

        // Stack<Student> students = new Stack<Student>();
		// students.push(new Student("S01", "A", 19));
		// students.push(new Student("S02", "B", 25));
		// students.push(new Student("S03", "C", 23));

        // while (!students.isEmpty()) {
        //     System.out.println(students.pop());
        // }
        // System.out.println(students.peek());
        // System.out.println(students);

        Queue<Student> students = new LinkedList<Student>();
		students.offer(new Student("S01", "A", 19));
		students.offer(new Student("S02", "B", 25));
		students.offer(new Student("S03", "C", 23));

		while (!students.isEmpty()) {
            System.out.println(students.poll());
        }
        System.out.println(students);

    }
    
}
