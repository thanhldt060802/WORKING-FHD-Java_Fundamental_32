import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import entity.Course;
import entity.DTO;
import entity.Enrollment;
import entity.Student;
import entity.DTO.DTO1;
import entity.DTO.DTO2;
import entity.DTO.Pair;
import enumeration.Gender;
import mockdata.MockData;

public class Task implements ITask {

    public class Cache {

        private static Map<Long, Double> mapAvg;

        public void setCacheMapAvg() {
            Cache.mapAvg = Task.this.enrollments.stream()
                    .collect(Collectors.groupingBy((e) -> e.getStudentId(),
                            Collectors.averagingDouble((e) -> e.getScore())));
        }

        public Map<Long, Double> getCacheMapAvg() {
            if (Cache.mapAvg == null) {
                this.setCacheMapAvg();
            }

            return Cache.mapAvg;
        }

    }

    private List<Student> students;
    private List<Course> courses;
    private List<Enrollment> enrollments;

    private Cache taskCache;

    public Task() {
        MockData mockData = new MockData(2025L);
        List<Student> students = mockData.students();
        List<Course> courses = mockData.courses();
        List<Enrollment> enrollments = mockData.enrollments(students, courses);

        this.students = students;
        this.courses = courses;
        this.enrollments = enrollments;

        this.taskCache = new Cache();
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
        return this.students.stream()
                .filter((stu) -> stu.getGender() == Gender.FEMALE)
                .toList();
    }

    @Override
    public List<Student> A2() throws Exception {
        return this.students.stream()
                .filter((stu) -> stu.getAge() > 22)
                .toList();
    }

    @Override
    public List<Student> A3() throws Exception {
        return this.students.stream()
                .sorted((stu1, stu2) -> stu1.getAge() - stu2.getAge())
                .toList();
    }

    @Override
    public List<Student> A4() throws Exception {
        return this.students.stream()
                .sorted((stu1, stu2) -> stu1.getName()
                        .compareTo(stu2.getName()))
                .toList();
    }

    @Override
    public List<String> A5() throws Exception {
        return this.students.stream()
                .map((stu) -> stu.getName())
                .toList();
    }

    @Override
    public List<String> A6() throws Exception {
        return this.students.stream()
                .map((stu) -> stu.getClassName())
                .distinct()
                .toList();
    }

    @Override
    public Map<String, List<Student>> A7() throws Exception {
        return this.students.stream()
                .collect(Collectors.groupingBy((stu) -> stu.getClassName()));
    }

    @Override
    public Map<Gender, List<Student>> A8() throws Exception {
        return this.students.stream()
                .collect(Collectors
                        .groupingBy((stu) -> stu.getGender()));
    }

    @Override
    public long A9() throws Exception {
        return this.students.stream()
                .filter((stu) -> stu.getGender() == Gender.FEMALE)
                .count();
    }

    @Override
    public double A10() throws Exception {
        Long courseId = this.courses.stream()
                .filter((c) -> c.getName().equals("XYZ"))
                .map((c) -> c.getId())
                .findFirst().orElse(null);

        if (courseId == null) {
            return 0;
        }

        return this.enrollments.stream()
                .filter(e -> e.getCourseId().equals(courseId))
                .mapToDouble((e) -> e.getScore())
                .average()
                .orElse(0);
    }

    @Override
    public List<Student> A11() throws Exception {
        return this.students.stream()
                .filter((stu) -> stu.getGender().equals(Gender.FEMALE))
                .sorted((stu1, stu2) -> stu1.getAge() - stu2.getAge())
                .toList();
    }

    @Override
    public List<Long> A12() throws Exception {
        return this.students.stream()
                // .filter((stu) -> stu.getGender().equals(Gender.MALE) && stu.getAge() < 23)
                .filter((stu) -> stu.getGender().equals(Gender.MALE))
                .filter((stu) -> stu.getAge() < 23)
                .map((stu) -> stu.getId())
                .toList();
    }

    @Override
    public List<Student> B1() throws Exception {
        List<Student> result = this.students.stream()
                .filter((stu) -> this.taskCache.getCacheMapAvg().get(stu.getId()) >= 8.0)
                .toList();

        result.forEach((stu) -> System.out.println(stu + " => " + this.taskCache.getCacheMapAvg().get(stu.getId())));

        return result;
    }

    @Override
    public List<Student> B2() throws Exception {
        Long courseId = this.courses.stream()
                .filter((cs) -> cs.getName().equals("Programming"))
                .map((cs) -> cs.getId())
                .findFirst().orElse(null);

        Map<Long, Student> stuMap = this.students.stream()
                .collect(Collectors.toMap((stu) -> stu.getId(), (stu) -> stu));

        return this.enrollments.stream()
                .filter((enr) -> enr.getCourseId().equals(courseId))
                .map((enr) -> stuMap.get(enr.getStudentId()))
                .toList();

        // return this.students.stream()
        // .filter((stu) -> this.enrollments.stream()
        // .anyMatch((e) -> e.getStudentId().equals(stu.getId())
        // && e.getCourseId().equals(this.courses.stream()
        // .filter(c -> c.getName()
        // .equals("Programming"))
        // .mapToLong((c) -> c.getId())
        // .findFirst().orElse(0L))))
        // .toList();
    }

    @Override
    public List<Student> B3() throws Exception {
        return this.students.stream()
                .sorted((stu1, stu2) -> Double.compare(this.taskCache.getCacheMapAvg().get(stu2.getId()),
                        this.taskCache.getCacheMapAvg().get(stu1.getId())))
                .toList();
    }

    @Override
    public List<Student> B4() throws Exception {
        Long programmingId = this.courses.stream()
                .filter((c) -> c.getName().equals("Programming"))
                .map((c) -> c.getId())
                .findFirst().orElse(0L);

        Map<Long, Double> stuProgrammingMap = this.enrollments.stream()
                .filter((enr) -> enr.getCourseId().equals(programmingId))
                .collect(Collectors.toMap((enr) -> enr.getStudentId(), (enr) -> enr.getScore()));

        // System.out.println("---> DEBUG");
        // stuProgrammingMap.forEach((stuId, courseScore) -> System.out.println(stuId +
        // ": " + courseScore));
        // System.out.println("DEBUG <----");

        List<Student> result = this.students.stream()
                // .filter((stu) -> stuProgrammingMap.get(stu.getId()) != null)
                .sorted((stu1, stu2) -> {

                    // double score1 = this.enrollments.stream()
                    // .filter((e) -> e.getStudentId().equals(stu1.getId())
                    // && e.getCourseId().equals(programmingId))
                    // .mapToDouble((e) -> e.getScore())
                    // .findFirst().orElse(0.0);

                    // double score2 = this.enrollments.stream()
                    // .filter((e) -> e.getStudentId().equals(stu2.getId())
                    // && e.getCourseId().equals(programmingId))
                    // .mapToDouble((e) -> e.getScore())
                    // .findFirst().orElse(0.0);

                    double score1 = stuProgrammingMap.getOrDefault(stu1.getId(), 0.0);
                    double score2 = stuProgrammingMap.getOrDefault(stu2.getId(), 0.0);

                    return Double.compare(score2, score1);
                })
                .toList();

        System.out.println("---> DEBUG");
        result.forEach((stu) -> System.out.println(stu + " => " + stuProgrammingMap.get(stu.getId())));
        System.out.println("DEBUG <----");

        return result;
    }

    public Map<String, List<Student>> test() {
        Map<String, List<Student>> stuClassMap = this.students.stream()
        .collect(Collectors.groupingBy((stu) -> stu.getClassName(),
        Collectors.collectingAndThen(Collectors.toList(), (stuList) -> {
            return stuList.stream()
            .sorted((stu1, stu2) -> stu1.getAge() - stu2.getAge())
            // .sorted(Comparator.comparingInt((stu) -> stu.getAge()))
            .toList();
        })));

        // stuClassMap.forEach((stuClass, stuList) -> {
        //     stuList.sort((stu1, stu2) -> stu1.getAge() - stu2.getAge());
        // });

        return stuClassMap;
    }

    @Override
    public List<DTO1> B5() throws Exception {
        Map<Long, Double> mapAvg = this.enrollments.stream()
                .collect(Collectors.groupingBy((e) -> e.getStudentId(),
                        Collectors.averagingDouble((e) -> e.getScore())));

        return this.students.stream()
                .map((stu) -> new DTO1(stu.getId(), stu.getName(), mapAvg.get(stu.getId())))
                .toList();
    }

    @Override
    public List<DTO2> B6() throws Exception {
        Map<Long, String> mapStuName = this.students.stream()
                .collect(Collectors.toMap((stu) -> stu.getId(), (stu) -> stu.getName()));

        Map<Long, String> mapCourseName = this.courses.stream()
                .collect(Collectors.toMap((c) -> c.getId(), (c) -> c.getName()));

        return this.enrollments.stream()
                .map((e) -> new DTO.DTO2(
                        e.getStudentId(),
                        mapStuName.get(e.getStudentId()),
                        mapCourseName.get(e.getCourseId()),
                        e.getScore()))
                .toList();
    }

    @Override
    public Map<Course, List<Enrollment>> B7() throws Exception {
        Map<Long, Course> mapCourseName = this.courses.stream()
                .collect(Collectors.toMap((c) -> c.getId(), (c) -> c));

        return this.enrollments.stream()
                .collect(Collectors.groupingBy((e) -> mapCourseName.get(e.getCourseId())));
    }

    @Override
    public Map<String, List<Student>> B8() throws Exception {
        Map<Long, Double> mapAvg = this.enrollments.stream()
                .collect(Collectors.groupingBy((e) -> e.getStudentId(),
                        Collectors.averagingDouble((e) -> e.getScore())));

        return this.students.stream()
                .collect(Collectors.groupingBy((stu) -> {
                    double avg = mapAvg.get(stu.getId());

                    if (avg < 6.0)
                        return "<6.0";
                    else if (avg < 8.0)
                        return "6.0-<8.0";
                    else
                        return ">=8.0";
                }));
    }

    @Override
    public Map<Student, Double> B9() throws Exception {
        Map<Long, Double> mapAvg = this.enrollments.stream()
                .collect(Collectors.groupingBy((e) -> e.getStudentId(),
                        Collectors.averagingDouble((e) -> e.getScore())));

        return this.students.stream()
                .collect(Collectors.toMap((stu) -> stu, (stu) -> mapAvg.get(stu.getId())));
    }

    @Override
    public Map<Course, Pair<Double>> B10() throws Exception {
        return this.courses.stream()
                .collect(Collectors.toMap((c) -> {
                    return c;
                }, (c) -> {
                    Double maxScore = this.enrollments.stream()
                            .filter(e -> e.getCourseId().equals(c.getId()))
                            .max((e1, e2) -> Double.compare(e1.getScore(), e2.getScore()))
                            .map((e) -> e.getScore())
                            .orElse(0.0);

                    Double minScore = this.enrollments.stream()
                            .filter(e -> e.getCourseId().equals(c.getId()))
                            .min((e1, e2) -> Double.compare(e1.getScore(), e2.getScore()))
                            .map((e) -> e.getScore())
                            .orElse(0.0);

                    return new DTO.Pair<Double>(maxScore, minScore);
                }));
    }

    @Override
    public List<DTO2> B11() throws Exception {
        Map<Long, String> mapStuName = this.students.stream()
                .collect(Collectors.toMap((stu) -> stu.getId(), (stu) -> stu.getName()));

        Map<Long, Gender> mapStuGender = this.students.stream()
                .collect(Collectors.toMap((stu) -> stu.getId(), (stu) -> stu.getGender()));

        Map<Long, String> mapCourseName = this.courses.stream()
                .collect(Collectors.toMap((c) -> c.getId(), (c) -> c.getName()));

        return this.enrollments.stream()
                .filter((e) -> mapStuGender.get(e.getStudentId()) == Gender.FEMALE)
                .map((e) -> new DTO.DTO2(
                        e.getStudentId(),
                        mapStuName.get(e.getStudentId()),
                        mapCourseName.get(e.getCourseId()),
                        e.getScore()))
                .sorted((dtoA, dtoB) -> {
                    int comp = dtoA.getCourseName().compareTo(dtoB.getCourseName());
                    if (comp != 0)
                        return comp;

                    return Double.compare(dtoB.getCourseScore(), dtoA.getCourseScore());
                })
                .toList();
    }

    @Override
    public Map<Course, List<Student>> B12() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Student, Double> C1() throws Exception {
        Map<Long, Double> mapAvg = this.enrollments.stream()
                .collect(Collectors.groupingBy((e) -> e.getStudentId(),
                        Collectors.averagingDouble((e) -> e.getScore())));

        return this.students.stream()
                .filter((stu) -> stu.getGender() == Gender.FEMALE
                        && mapAvg.get(stu.getId()) > 7.5
                        && stu.getAge() > 21)
                .collect(Collectors.toMap((stu) -> stu, (stu) -> mapAvg.get(stu.getId())));
    }

    @Override
    public List<Student> C2() throws Exception {
        Long mathId = this.courses.stream()
                .filter((c) -> c.getName().equals("Math"))
                .map((c) -> c.getId())
                .findFirst().orElse(0L);

        Map<Long, Student> mapStu = this.students.stream()
                .collect(Collectors.toMap((stu) -> stu.getId(), (stu) -> stu));

        Map<Long, String> mapClassName = this.students.stream()
                .collect(Collectors.toMap((stu) -> stu.getId(), (stu) -> stu.getClassName()));

        return this.enrollments.stream()
                .filter((e) -> mapClassName.get(e.getStudentId()).equals("CSE1")
                        && e.getCourseId() == mathId
                        && e.getScore() > 8.0)
                .map((e) -> mapStu.get(e.getStudentId()))
                .toList();
    }

    @Override
    public Map<Student, Double> C3() throws Exception {
        Map<Long, Double> mapAvg = this.enrollments.stream()
                .collect(Collectors.groupingBy((e) -> e.getStudentId(),
                        Collectors.averagingDouble((e) -> e.getScore())));

        return this.students.stream()
                .sorted((stu1, stu2) -> {
                    int comp1 = stu1.getClassName().compareTo(stu2.getClassName());
                    if (comp1 != 0)
                        return comp1;

                    int comp2 = stu1.getAge() - stu2.getAge();
                    if (comp2 != 0)
                        return comp2;

                    return Double.compare(mapAvg.get(stu2.getId()), mapAvg.get(stu1.getId()));
                })
                .collect(Collectors.toMap(
                        (stu) -> stu,
                        (stu) -> mapAvg.get(stu.getId()),
                        (oldVal, newVal) -> newVal,
                        LinkedHashMap::new));
    }

    @Override
    public List<Student> C4() throws Exception {
        Map<Long, Double> mapSum = this.enrollments.stream()
                .collect(Collectors.groupingBy((e) -> e.getStudentId(),
                        Collectors.summingDouble((e) -> e.getScore())));

        mapSum.forEach((t, k) -> System.out.println(t + " " + k));

        return this.students.stream()
                .sorted((stu1, stu2) -> Double.compare(mapSum.get(stu2.getId()),
                        mapSum.get(stu1.getId())))
                .limit(5)
                .toList();
    }

    @Override
    public Map<Student, List<Course>> C5() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<DTO2> C6() throws Exception {

        Map<Long, String> mapStuName = this.students.stream()
                .collect(Collectors.toMap((stu) -> stu.getId(), (stu) -> stu.getName()));

        Map<Long, String> mapCourseName = this.courses.stream()
                .collect(Collectors.toMap((c) -> c.getId(), (c) -> c.getName()));

        Map<Long, Integer> mapCourseCredit = this.courses.stream()
                .collect(Collectors.toMap((c) -> c.getId(), (c) -> c.getCredit()));

        return this.enrollments.stream()
                .filter((e) -> mapCourseCredit.get(e.getCourseId()) >= 3)
                .map((e) -> new DTO.DTO2(
                        e.getStudentId(),
                        mapStuName.get(e.getStudentId()),
                        mapCourseName.get(e.getCourseId()),
                        e.getScore()))
                .toList();
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
        Map<Long, String> mapClassName = this.students.stream()
                .collect(Collectors.toMap((stu) -> stu.getId(), (stu) -> stu.getClassName()));

        return this.enrollments.stream()
                .collect(Collectors.groupingBy((e) -> mapClassName.get(e.getCourseId()),
                        Collectors.averagingDouble((e) -> e.getScore())));
    }

    @Override
    public List<Course> C10() throws Exception {
        Map<Long, Long> mapCourseCount = this.enrollments.stream()
                .collect(Collectors.groupingBy(e -> e.getCourseId(), Collectors.counting()));

        return this.courses.stream()
                .sorted((c1, c2) -> mapCourseCount.get(c2.getId())
                        .compareTo(mapCourseCount.get(c1.getId())))
                .limit(5)
                .toList();
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