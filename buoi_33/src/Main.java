import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {

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

        // // // List<String> result = list.stream()
        // // // .filter((stu) -> {
        // // //     return stu.getAge() > 21;
        // // // })
        // // // .collect(Collectors.mapping((stu) -> {
        // // //     return stu.getId();
        // // // }, Collectors.toList()));

        // // List<String> result = list.stream()
        // // .filter((stu) -> {
        // //     return stu.getAge() > 21;
        // // })
        // // .map((stu) -> {
        // //     return stu.getId();
        // // })
        // // .toList();

        // // for (String str : result) {
        // //     System.out.println(str);
        // // }

        // // Map<String, List<String>> result = list.stream()
        // // .collect(Collectors.groupingBy((stu) -> {
        // //     return stu.getClassName();
        // // }, Collectors.mapping((stu) -> {
        // //     return stu.getId();
        // // }, Collectors.toList())));

        // // Map<String, Double> result = list.stream()
        // // .collect(Collectors.groupingBy((stu) -> {
        // //     return stu.getClassName();
        // // }, Collectors.averagingDouble((stu) -> {
        // //     return stu.getAvg();
        // // })));

        // Map<String, Long> result = list.stream()
        // .collect(Collectors.groupingBy((stu) -> {
        //     return stu.getClassName();
        // }, Collectors.counting()));

        // // for (Entry<String, List<Student>> entry : result.entrySet()) {
        // //     System.out.println(entry.getKey());
        // //     for (Student stu : entry.getValue()) {
        // //         System.out.println(stu);
        // //     }
        // //     System.out.println("------------------------");
        // // }
        // // result.forEach((key, value) -> {
        // //     System.out.println(key);
        // //     value.forEach((stu) -> System.out.println(stu));
        // // });
        // result.forEach((key, value) -> {
        //     System.out.println(key + ": " + value);
        // });

        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Integer result = list.stream()
        // .filter((n) -> {
        //     return n > 4;
        // })
        // .reduce((n1, n2) -> {
        //     return n1 + n2;
        // })
        // .orElse(null);

        // Integer result = list.stream()
        // .filter((n) -> {
        //     return n > 4;
        // })
        // .reduce(10, (n1, n2) -> {
        //     return n1 + n2;
        // });

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

        // String result = list.stream()
        // .reduce("", (stuName, stu) -> {
        //     if (stuName.isEmpty()) {
        //         return stu.getName();
        //     }
        //     return stuName + " - " + stu.getName();
        // }, (stuName1, stuName2) -> {
        //     return stuName1 + stuName2;
        // });

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

        // Student result = list.stream()
        // .filter((stu) -> {
        //     return stu.getAge() > 21;
        // })
        // .findAny().orElse(null);

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

        // long result = list.stream()
        // .filter((stu) -> {
        //     return stu.getAge() > 21;
        // })
        // .count();

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

        // // boolean result1 = list.stream().anyMatch((stu) -> {
        // //     return stu.getAge() > 25;
        // // });
        // // boolean result2 = list.stream().anyMatch((stu) -> {
        // //     return stu.getAge() > 22;
        // // });

        // // boolean result1 = list.stream().allMatch((stu) -> {
        // //     return stu.getAge() > 21;
        // // });
        // // boolean result2 = list.stream().allMatch((stu) -> {
        // //     return stu.getAge() > 18;
        // // });

        // boolean result1 = list.stream().noneMatch((stu) -> {
        //     return stu.getAge() > 25;
        // });
        // boolean result2 = list.stream().noneMatch((stu) -> {
        //     return stu.getAge() > 22;
        // });

        // System.out.println(result1);
        // System.out.println(result2);

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

        // Student result = list.stream().min((stu1, stu2) -> stu1.getAge() - stu2.getAge()).orElse(null);

        // System.out.println(result);

        // Student result = list.stream().max((stu1, stu2) -> stu1.getAge() - stu2.getAge()).orElse(null);

        // System.out.println(result);

        // double result = list.stream().mapToDouble((stu) -> stu.getAvg()).sum();
        // double result = list.stream().mapToDouble((stu) -> stu.getAvg()).average().orElse(0);

        // System.out.println(result);

        // DoubleSummaryStatistics statistics = list.stream().mapToDouble((stu) -> stu.getAvg()).summaryStatistics();

        // System.out.println(statistics);
        // System.out.println(statistics.getCount());
        // System.out.println(statistics.getSum());
        // System.out.println(statistics.getAverage());
        // System.out.println(statistics.getMin());
        // System.out.println(statistics.getMax());

        Task task = new Task();
        task.showDataset();        
        Task.print(task.B5());

    }

}
