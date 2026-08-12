import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

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

        // List<Student> result = list.stream()
        // .filter((stu) -> stu.getAvg() >= 8.0)
        // .toList();

        // System.out.println("Data before processing:");
        // for (Student stu : list) {
        // System.out.println(stu);
        // }
        // System.out.println("Data after processing:");
        // for (Student stu : result) {
        // System.out.println(stu);
        // }

        // List<Double> result = list.stream()
        // .map((stu) -> {
        // return stu.getAvg();
        // })
        // .toList();

        // System.out.println("Data before processing:");
        // for (Student stu : list) {
        // System.out.println(stu);
        // }
        // System.out.println("Data after processing:");
        // for (Double avg : result) {
        // System.out.println(avg);
        // }

        /**
         * Ví dụ về flatMap: Thống kê số lượng mặt hàng bán được
         * - Ngày 1: 7h-8h=15item, 8h-9h=10item, 9h-10h=19item
         * - Ngày 2: 4h-5h=7item, 7h-8h=8item
         * - Ngày 3: 7h-8h=15item, 8h-9h=10item, 9h-10h=19item, 10h-11h=10item
         */

        // List<List<Integer>> list2d = new ArrayList<>();
        // List<Integer> day1 = new ArrayList<>();
        // day1.add(15);
        // day1.add(10);
        // day1.add(19);
        // list2d.add(day1);
        // List<Integer> day2 = new ArrayList<>();
        // day2.add(7);
        // day2.add(8);
        // list2d.add(day2);
        // List<Integer> day3 = new ArrayList<>();
        // day3.add(15);
        // day3.add(10);
        // day3.add(19);
        // day3.add(10);
        // list2d.add(day3);

        // List<Integer> result = list2d.stream()
        // .flatMap((list1d) -> {
        // return list1d.stream();
        // })
        // .toList();

        // int sumAllDay = list2d.stream()
        // .flatMap((list1d) -> {
        // return list1d.stream();
        // })
        // .mapToInt((n) -> {
        // return n;
        // })
        // .sum();

        // List<Integer> sumByDay = list2d.stream()
        // .map((list1d) -> {
        // return list1d.stream()
        // .mapToInt((n) -> {
        // return n;
        // })
        // .sum();
        // })
        // .toList();

        // System.out.println("Data before processing:");
        // System.out.println(list2d);
        // // for (List<Integer> intList : list2d) {
        // // for (Integer n : intList) {
        // // System.out.println(n);
        // // }
        // // }
        // System.out.println("Data after processing:");
        // // System.out.println(result);
        // System.out.println(sumAllDay);
        // System.out.println(sumByDay);

        List<Student> result = list.stream()
                .filter((stu) -> stu.getAge() > 21)
                .sorted((stu1, stu2) -> {
                    int ageComparing = stu1.getAge() - stu2.getAge();
                    if (ageComparing != 0) {
                        return ageComparing;
                    }

                    int avgComparing = -Double.compare(stu1.getAvg(), stu2.getAvg());
                    return avgComparing;
                })
                .toList();

        System.out.println("Data before processing:");
        for (Student stu : list) {
            System.out.println(stu);
        }
        System.out.println("Data after processing:");
        for (Student stu : result) {
            System.out.println(stu);
        }

    }

}
