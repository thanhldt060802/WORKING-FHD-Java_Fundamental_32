package bai2;

import java.util.ArrayList;

public class StudentManagement {
    public ArrayList<Student> studentList;

    public StudentManagement() {
        this.studentList = new ArrayList<>();
    }

    public void showAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }
        
        for (Student student : studentList) {
            System.out.println(student.getInfor());
        }
    }

    public void addStudent(Student student) {
        if (!this.isValidStudent(student)) {
            System.out.println("Lỗi, dữ liệu sinh viên không hợp lệ!");
            return;
        }

        if (searchStudentById(student.id) != null) {
            System.out.println("Lỗi, mã sinh viên đã tồn tại!");
            return;
        }

        studentList.add(student);
        System.out.println("Thêm thành công sinh viên: " + student.name);
    }

    public Student searchStudentById(String id) {
        for (Student student : studentList) {
            if (student.id.equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(Student student) {
        Student existingStudent = searchStudentById(student.id);
        if (existingStudent == null) {
            System.out.println("Lỗi, không tìm thấy sinh viên có ID " + student.id + " để cập nhật");
            return;
        }

        if (!this.isValidStudent(student)) {
            System.out.println("Lỗi, dữ liệu sinh viên không hợp lệ!");
            return;
        }

        existingStudent.name = student.name;
        existingStudent.age = student.age;
        System.out.println("Cập nhật thành công sinh viên có ID " + student.id);
    }

    public void removeStudentById(String id) {
        Student existingStudent = searchStudentById(id);
        if (existingStudent == null) {
            System.out.println("Lỗi, không tìm thấy sinh viên có ID " + id + " để xóa.");
            return;
        }
        studentList.remove(existingStudent);
        System.out.println("Xóa thành công sinh viên có ID " + id);
    }

    public boolean isValidStudent(Student student) {
        if (student == null) {
            return false;
        }

        return Utils.isNotEmptyString(student.id) &&
                Utils.isNotEmptyString(student.name) &&
                Utils.isPositiveInteger(student.age);
    }
}
