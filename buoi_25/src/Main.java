import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

        // String[] strArr = new String[] {"32", "123", "234", "42", "342", "452", "424"};

        // System.out.println(Arrays.toString(strArr));
        // Arrays.sort(strArr);
        // System.out.println(Arrays.toString(strArr));

        Student[] stuArr = new Student[] {
            new Student("01", "Tan Thanh", 24),
            new Student("02", "Phuong Nam", 22),
            new Student("03", "Minh Duc", 24),
            new Student("04", "Thinh Nguyen", 22),
            new Student("05", "Tuan Kiet", 23),
        };

        for (Student s : stuArr) {
            System.out.println(s);
        }

        System.out.println();

        // Arrays.sort(stuArr);
        StudentAgeComparator comparator = new StudentAgeComparator();
        Arrays.sort(stuArr, comparator);
        // Arrays.sort(stuArr, (s1, s2) -> s1.age - s2.age);

        for (Student s : stuArr) {
            System.out.println(s);
        }

        // Object s1 = new Student("01", "Tan Thanh", 25);
        // Object s2 = new Student("02", "Tuan Kiet", 25);
        // if (s1 instanceof Comparable) {
        //     System.out.println(((Comparable)s1).compareTo(s2));
        // }

    }

}
