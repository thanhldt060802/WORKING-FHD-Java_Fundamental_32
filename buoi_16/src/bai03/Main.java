package bai03;

public class Main {
    public static void main(String[] args) {
        // 1. Khởi tạo một đối tượng Employee mới (Tuổi ban đầu đặt đại là 20)
        Employee emp = new Employee("NV001", "Nguyen", "Van", "A", 20, 10000000, 2);

        System.out.println("=== THÔNG TIN BAN ĐẦU ===");
        // Kiểm tra hàm getInfo()
        System.out.println(emp.getInfo());

        // Kiểm tra hàm getName() và getSalary()
        System.out.println("Họ và tên đầy đủ: " + emp.getName());
        System.out.println("Lương thực tế (Lương * Hệ số): " + emp.getSalary());

        System.out.println("\n=== THỬ NGHIỆM CÁC HÀM SETTER ===");
        // Đổi tên nhân viên
        emp.setFirstName("Tran");
        emp.setMiddleName("Thi");
        emp.setLastName("B");
        System.out.println("Tên sau khi đổi: " + emp.getName());

        // Thử nghiệm setAge(int age) - Đặt trực tiếp số tuổi
        emp.setAge(25);
        System.out.println("Tuổi sau khi setAge(int): " + emp.getAge());

        // Thử nghiệm setAge(String dob) - Tính tuổi tự động dựa trên năm hiện tại (2026)
        // Nếu sinh năm 2000, lấy 2026 - 2000 = 26 tuổi
        emp.setAge("10/06/2000");
        System.out.println("Tuổi sau khi setAge(String \"15/08/2000\"): " + emp.getAge());

        System.out.println("\n=== THÔNG TIN SAU KHI THAY ĐỔI ===");
        System.out.println(emp.getInfo());
    }
}
