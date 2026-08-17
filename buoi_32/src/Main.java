import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // List<Student> list = new ArrayList<>();
        // list.add(new Student("412", "Tran Van A", 19, "A2", 7.9));
        // list.add(new Student("412", "Nguyen Thi B", 21, "A3", 8.9));
        // list.add(new Student("412", "Le Van D", 23, "A1", 6.9));
        // list.add(new Student("642", "Tran Thi A", 22, "A2", 7.5));
        // list.add(new Student("642", "Nguyen Van C", 22, "A1", 8.9));
        // list.add(new Student("642", "Le Van D", 23, "A1", 9.6));
        // list.add(new Student("531", "Nguyen Van C", 21, "A2", 5.9));
        // list.add(new Student("531", "Tran Thi B", 22, "A3", 8.5));
        // list.add(new Student("531", "Le Thi D", 19, "A3", 7.7));
        // list.add(new Student("531", "Tran Van C", 20, "A1", 9.9));

        // List<Student> result = list.stream().distinct().toList();

        // System.out.println("Data before processing:");
        // for (Student stu : list) {
        // System.out.println(stu);
        // }
        // System.out.println("Data after processing:");
        // for (Student stu : result) {
        // System.out.println(stu);
        // }

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

        // // int page = 3;
        // // int limitPerPage = 4;
        // // List<Student> result = list.stream()
        // // .skip((page - 1) * limitPerPage)
        // // .limit(limitPerPage)
        // // .toList();

        // List<Student> result = list.stream()
        // .limit(5)
        // .skip(3)
        // .toList();

        // System.out.println("Data before processing:");
        // for (Student stu : list) {
        // System.out.println(stu);
        // }
        // System.out.println("Data after processing:");
        // for (Student stu : result) {
        // System.out.println(stu);
        // }

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

        // list.stream()
        // .filter((stu) -> {
        // return stu.getAge() > 21;
        // })
        // .forEach((stu) -> {
        // System.out.println(stu);
        // });

        // Integer[] x = new Integer[10];
        // f(x);

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

        // List<Student> result = list.stream()
        // .filter((stu) -> {
        // return stu.getAge() > 21;
        // })
        // .collect(Collectors.toList());

        // for (Student stu : result) {
        // System.out.println(stu);
        // }

        // List<Student> list = new ArrayList<>();
        // list.add(new Student("412", "Tran Van A", 19, "A2", 7.9));
        // list.add(new Student("412", "Nguyen Thi B", 21, "A3", 8.9));
        // list.add(new Student("412", "Le Van D", 23, "A1", 6.9));
        // list.add(new Student("642", "Tran Thi A", 22, "A2", 7.5));
        // list.add(new Student("642", "Nguyen Van C", 22, "A1", 8.9));
        // list.add(new Student("642", "Le Van D", 23, "A1", 9.6));
        // list.add(new Student("531", "Nguyen Van C", 21, "A2", 5.9));
        // list.add(new Student("531", "Tran Thi B", 22, "A3", 8.5));
        // list.add(new Student("531", "Le Thi D", 19, "A3", 7.7));
        // list.add(new Student("531", "Tran Van C", 20, "A1", 9.9));

        // Set<Student> result = list.stream()
        // .filter((stu) -> {
        // return stu.getAge() > 21;
        // })
        // .collect(Collectors.toSet());

        // for (Student stu : result) {
        // System.out.println(stu);
        // }

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
        // list.add(new Student("412", "Tran Van C", 20, "A1", 9.9));

        // // Map<String, Student> result = list.stream()
        // // .filter((stu) -> {
        // //     return stu.getAge() > 21;
        // // })
        // // .collect(Collectors.toMap((stu) -> {
        // //     return stu.getId();
        // // }, (stu) -> {
        // //     return stu;
        // // }));

        // // for (Entry<String, Student> entry : result.entrySet()) {
        // //     System.out.println(entry.getKey() + ": " + entry.getValue());
        // // }

        // Map<String, String> result = list.stream()
        // // .filter((stu) -> {
        // //     return stu.getAge() > 21;
        // // })
        // .collect(Collectors.toMap((stu) -> {
        //     return stu.getId();
        // }, (stu) -> {
        //     return stu.getName();
        // }));
        // // .collect(Collectors.toMap((stu) -> {
        // //     return stu.getId();
        // // }, (stu) -> {
        // //     return stu.getName();
        // // }, (existedStu, duplicatedStu) -> {
        // //     return existedStu;
        // // }, () -> {
        // //     return new LinkedHashMap<>();
        // // }));

        // for (Entry<String, String> entry : result.entrySet()) {
        //     System.out.println(entry.getKey() + ": " + entry.getValue());
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

        Map<String, List<String>> result = list.stream()
        // .filter((stu) -> {
        //     return stu.getAge() > 21;
        // })
        .collect(Collectors.groupingBy((stu) -> {
            return stu.getClassName();
        }, () -> {
            return new LinkedHashMap<>();
        }, Collectors.mapping((stu) -> {
            return stu.getName();
        }, Collectors.toList())));

        for (Entry<String, List<String>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (String stuName : entry.getValue()) {
                System.out.println(stuName);
            }
        }

    }

    // public static void f(Object[] x) {

    // }

}
