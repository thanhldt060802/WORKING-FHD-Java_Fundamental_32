import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import entity.Course;
import entity.Enrollment;
import entity.Student;
import entity.DTO.DTO1;
import entity.DTO.DTO2;
import entity.DTO.Pair;
import enumeration.Gender;
import mockdata.MockData;

public class Task implements ITask {

    private List<Student> students;
    private List<Course> courses;
    private List<Enrollment> enrollments;

    public Task() {
        MockData mockData = new MockData(2025L);
        List<Student> students = mockData.students();
        List<Course> courses = mockData.courses();
        List<Enrollment> enrollments = mockData.enrollments(students, courses);

        this.students = students;
        this.courses = courses;
        this.enrollments = enrollments;
    }

    public void showDataset() {
        System.out.println("Mock data - Student:");
        this.students.forEach(
            (student) -> System.out.println(student));
        System.out.println();
        System.out.println("Mock data - Course:");
        this.courses.forEach(
            (course) -> System.out.println(course));
        System.out.println();
        System.out.println("Mock data - Enrollment:");
        this.enrollments.forEach(
            (enrollment) -> System.out.println(enrollment));
        System.out.println();
    }

    public static void print(Object data) {
        if (data instanceof Collection<?> dataCollection) {
            for (Object element : dataCollection) {
                System.out.println(element);
            }
        } else if (data instanceof Map<?, ?> dataMap) {
            for (Entry<?, ?> entry : dataMap.entrySet()) {
                if (entry.getValue() instanceof Collection<?> dataCollection) {
                    System.out.println(entry.getKey() + ":");
                    print(dataCollection);
                } else if (entry.getValue() instanceof Map<?, ?> nestedDataMap) {
                    System.out.println(entry.getKey() + ":");
                    print(nestedDataMap);
                } else {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
        } else {
            System.out.println(data);
        }
    }

    @Override
    public List<Student> A1() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> A2() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> A3() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> A4() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<String> A5() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<String> A6() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<String, List<Student>> A7() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Gender, List<Student>> A8() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public long A9() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public double A10() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> A11() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Long> A12() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> B1() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> B2() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> B3() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> B4() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<DTO1> B5() throws Exception {
        Map<Long, Double> avgMap = this.enrollments.stream()
        .collect(Collectors.groupingBy((enr) -> {
            return enr.getStudentId();
        }, Collectors.averagingDouble((enr) -> {
            return enr.getScore();
        })));

        List<DTO1> result = this.students.stream()
        .map((stu) -> {
            return new DTO1(stu.getId(), stu.getName(), avgMap.get(stu.getId()));

            // double gpa = this.enrollments.stream()
            // .filter((filteredEnr) -> {
            //     return filteredEnr.getStudentId().equals(stu.getId());
            // })
            // .mapToDouble((enr) -> {
            //     return enr.getScore();
            // })
            // .average().orElse(0);

            // return new DTO1(stu.getId(), stu.getName(), gpa);
        })
        .toList();

        // System.out.println();
        // this.enrollments.stream().filter((enr) -> enr.getStudentId().equals(new Long(50L))).forEach((enr) -> System.out.println(enr));
        // System.out.println();

        return result;
    }

    @Override
    public List<DTO2> B6() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Course, List<Enrollment>> B7() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<String, List<Student>> B8() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Student, Double> B9() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Course, Pair<Double>> B10() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<DTO2> B11() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Course, List<Student>> B12() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Student, Double> C1() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> C2() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Student, Double> C3() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> C4() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Student, List<Course>> C5() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<DTO2> C6() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<String, Map<Gender, List<Student>>> C7() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Course, Map<String, List<Student>>> C8() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<String, Double> C9() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Course> C10() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<String, List<DTO1>> C11() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<String, List<DTO1>> C12() throws Exception {
        throw new Exception("You must handle this task");
    }

}