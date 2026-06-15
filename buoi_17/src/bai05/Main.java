package bai05;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // System.out.println("30/04/2026".compareTo("15/06/2026"));
        // System.out.println("2026-04-30".compareTo("2026-06-15"));
        // try {
        //     System.out.println(Util.compareDateString("30/04/2026", "15/06/2026", Util.VN_DATE_FORMAT));
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        // 1. Khởi tạo đối tượng quản lý thư viện
        Library library = new Library();

        // 2. Tạo các đối tượng sách mẫu (Định dạng ngày YYYY-MM-DD để so sánh chuẩn chuỗi)
        // Book b1 = new Book("B01", "Lập trình Java", "2024-05-10", "Công nghệ", "Nguyễn Văn A", 150000, 0.1);
        // Book b2 = new Book("B02", "Cấu trúc dữ liệu", "2025-02-20", "Công nghệ", "Trần Thị B", 120000, 0.15);
        // Book b3 = new Book("B03", "Đại số tuyến tính", "2023-11-15", "Toán học", "Nguyễn Văn A", 90000, 0.05);
        // Book b4 = new Book("B04", "Giải tích 1", "2026-01-05", "Toán học", "Lê Văn C", 110000, 0.2);
        Book b1 = new Book("B01", "Lập trình Java", "10/05/2024", "Công nghệ", "Nguyễn Văn A", 150000, 0.1);
        Book b2 = new Book("B02", "Cấu trúc dữ liệu", "20/02/2025", "Công nghệ", "Trần Thị B", 120000, 0.15);
        Book b3 = new Book("B03", "Đại số tuyến tính", "15/11/2023", "Toán học", "Nguyễn Văn A", 90000, 0.05);
        Book b4 = new Book("B04", "Giải tích 1", "05/01/2026", "Toán học", "Lê Văn C", 110000, 0.2);

        System.out.println("=== 1. KIỂM TRA HÀM ADD / SHOW ===");
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addBook(b1); // Thử thêm trùng ID B01 xem hệ thống có chặn không

        System.out.println("\n--- Toàn bộ sách hiện có trong thư viện ---");
        library.showAllBooks();

        // System.out.println("\n=== 2. KIỂM TRA HÀM UPDATE ===");
        // // Cập nhật thông tin sách B02
        // Book b2NewInfo = new Book("B02", "Cấu trúc dữ liệu (Tái bản v2)", "2025-02-20", "Công nghệ", "Trần Thị B", 135000, 0.18);
        // library.updateBook(b2NewInfo);

        // System.out.println("\n=== 3. KIỂM TRA CÁC HÀM TÌM KIẾM NÂNG CAO ===");

        // // Tìm theo khoảng ngày xuất bản (Hàm gây lỗi ban đầu của bạn)
        // System.out.println("\n> Tìm sách xuất bản trong khoảng '2024-01-01' đến '2025-12-31':");
        // // ArrayList<Book> booksByDate = library.searchBookListByPublicationDateInRange("2024-01-01", "2025-12-31");
        // ArrayList<Book> booksByDate = library.searchBookListByPublicationDateInRange("01/01/2024", "31/12/2025");
        // printList(booksByDate);

        // // Tìm theo tên loại (Category)
        // System.out.println("\n> Tìm sách thuộc thể loại 'Toán học':");
        // ArrayList<Book> booksByCategory = library.searchBookListByCategoryName("toán học");
        // printList(booksByCategory);

        // // Tìm theo tên tác giả (Author)
        // System.out.println("\n> Tìm sách của tác giả 'Nguyễn Văn A':");
        // ArrayList<Book> booksByAuthor = library.searchBookListByAuthorName("Nguyễn Văn A");
        // printList(booksByAuthor);

        // // Tìm theo khoảng giá tiền (Price)
        // System.out.println("\n> Tìm sách trong khoảng giá từ 100,000đ đến 140,000đ:");
        // ArrayList<Book> booksByPrice = library.searchBookListByPriceInRange(100000, 140000);
        // printList(booksByPrice);

        // // Tìm theo khoảng tỷ lệ chiết khấu (Discount Rate)
        // System.out.println("\n> Tìm sách có chiết khấu từ 10% đến 20% (0.1 đến 0.2):");
        // ArrayList<Book> booksByDiscount = library.searchBookListByDiscountRateInRange(0.1, 0.2);
        // printList(booksByDiscount);

        System.out.println("\n=== 4. KIỂM TRA CÁC HÀM SẮP XẾP ===");

        // Sắp xếp tăng dần theo giá
        // library.sortBookListByPriceAscending();
        // library.showAllBooks();

        // // Sắp xếp giảm dần theo tên sách
        // System.out.println();
        library.sortBookListByNameDescending();
        library.showAllBooks();

        // System.out.println("\n=== 5. KIỂM TRA HÀM XÓA ===");
        // library.removeBookById("B03"); // Xóa cuốn Đại số tuyến tính

        // System.out.println("\n--- Thư viện sau khi xóa sách ID B03 ---");
        // library.showAllBooks();
    }

    /**
     * Hàm phụ trợ static hỗ trợ in nhanh cấu trúc danh sách ArrayList trả về từ các hàm tìm kiếm
     */
    private static void printList(ArrayList<Book> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("(Không tìm thấy quyển sách nào phù hợp điều kiện)");
        } else {
            for (Book b : list) {
                System.out.println(b);
            }
        }
    }
}