import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // String[] a = new String[10];
        // List<String> list = Arrays.asList(a);
        // list.stream().filter(null).sorted().collect(Collectors.toMap(null, null));

        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Predicate<Integer> isOddNum = (t) -> t % 2 != 0;
		// List<Integer> result = Main.filter(list, (t) -> t % 2 != 0);
		// System.out.println(result);

        // Predicate<Integer> isOddNum = (n) -> n % 2 != 0;
        // Consumer<Integer> print = (n) -> System.out.println(n);
        // list.stream().filter((n) -> n % 2 != 0).forEach((n) -> System.out.println(n));
        // List<Integer> result = list.stream().filter((n) -> n % 2 != 0).collect(Collectors.toList());
        // System.out.println(result);

        // List<Student> list = new ArrayList<>();
        // list.add(new Student("412", "Tran Van A", 19, "A2", 7.9));
        // list.add(new Student("132", "Nguyen Thi B", 21, "A3", 8.9));
        // list.add(new Student("245", "Le Van D", 23, "A1", 6.9));
        // list.add(new Student("642", "Tran Thi A", 22, "A2", 7.5));
        // list.add(new Student("536", "Nguyen Van C", 22, "A1", 8.9));
        // list.add(new Student("315", "Le Van D", 23, "A1", 9.6));
        // list.add(new Student("531", "Nguyen Van C", 21, "A2", 5.9));
        // list.add(new Student("431", "Tran Thi B", 22, "A3", 8.5));
        // list.add(new Student("267", "Le Thi D", 19, "A3", 7.7));
        // list.add(new Student("647", "Tran Van C", 20, "A1", 9.9));

        // List<Student> result = list.stream().filter((stu) -> {
        //     return stu.getAge() > 21;
        // }).toList();

        // System.out.println("Data before processing:");
        // for (Student stu : list) {
        //     System.out.println(stu);
        // }
        // System.out.println("Data after processing:");
        // for (Student stu : result) {
        //     System.out.println(stu);
        // }

        List<Student> list = new ArrayList<>();
        list.add(new Student("412", "Tran Van A", 19, "A2", 7.9));
        list.add(new Student("132", "Nguyen Thi B", 21, "A3", 8.9));
        list.add(new Student("245", "Le Van D", 23, "A1", 6.9));
        list.add(new Student("642", "Tran Thi A", 22, "A2", 7.5));
        list.add(new Student("536", "Nguyen Van C", 22, "A1", 8.9));
        list.add(new Student("315", "Le Van D", 23, "A1", 9.6));
        list.add(new Student("531", "Nguyen Van C", 21, "A2", 5.9));
        list.add(new Student("431", "Tran Thi B", 22, "A3", 8.5));
        list.add(new Student("267", "Le Thi D", 19, "A3", 7.7));
        list.add(new Student("647", "Tran Van C", 20, "A1", 9.9));

        // List<String> result = list.stream().map((stu) -> {
        //     return stu.getName();
        // }).toList();

        // System.out.println("Data before processing:");
        // for (Student stu : list) {
        //     System.out.println(stu);
        // }
        // System.out.println("Data after processing:");
        // for (String str : result) {
        //     System.out.println(str);
        // }

        double result = list.stream()
        .filter((stu) -> stu.getAge() > 21)
        .mapToDouble((stu) -> stu.getAvg()).average().getAsDouble();

        System.out.println(result);

    }

    // public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
	// 	List<T> result = new ArrayList<T>();
	// 	for(T e : list) {
	// 		if(predicate.test(e)) {
	// 			result.add(e);
	// 		}
	// 	}
	// 	return result;
	// }

}
