package bai2;

public class Main {
    public static void main(String[] args) {
        StudentManagement manager = new StudentManagement();

        // 1. Tạo thử vài sinh viên
        Student s1 = new Student("SV01", "Nguyen Van A", 20);
        Student s2 = new Student("SV02", "Tran Thi B", 21);
        Student s3 = new Student("SV01", "Le Van C", 22); // Trùng ID với s1
        Student s4 = new Student("SV04", "Tan Thanh", 19);

        // 2. Thêm sinh viên
        System.out.println("--- Thêm sinh viên ---");
        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3); // Sẽ báo lỗi trùng ID
        manager.addStudent(s4);

        // 3. Hiển thị danh sách
        System.out.println("\n--- Danh sách sinh viên hiện tại ---");
        manager.showAllStudents();

        // // 4. Cập nhật sinh viên SV02
        // System.out.println("\n--- Cập nhật sinh viên ---");
        // Student s2Update = new Student("SV02", "Tran Thi B (Đã đổi tên)", 22);
        // manager.updateStudent(s2Update);
        // manager.showAllStudents();

        // // 5. Xóa sinh viên SV01
        // System.out.println("\n--- Xóa sinh viên ---");
        // manager.removeStudentById("SV01");
        // manager.showAllStudents();
    }
}