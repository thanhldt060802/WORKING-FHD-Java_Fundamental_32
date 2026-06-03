import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Student s = new Student("1", "Thanh");
        // System.out.println(s.id);
        // System.out.println(s.name);
        // s.id = "X";
        // System.out.println(s.id);
        // s.name = "";
        // System.out.println(s.name);
        // System.out.println(s.getInfo());
        // System.out.println(s.getId());
        // System.out.println(s.getName());
        // s.setName("     Tan Thanh      ");
        // System.out.println("|" + s.getName() + "|");

        // Product p = new Product("P01", "Snack Khoai Tay", 10000, 0.25, 10);
		// System.out.println(p.getRemainingDays());
		// p.setRemainingDays("03/06/2026");
		// System.out.println(p.getRemainingDays());

        /**
         * Sửa thuộc tính remainingDays của Product thành kiểu double, điều chỉnh hàm setRemainingDays để tính ra
         * giá trị số ngày còn lại một cách chính xác hơn (ví dụ: 0.5, 0.9, 1.7, ...)
         */

        // Calendar calendar = Calendar.getInstance();
        // // System.out.println(calendar);
        // System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        // System.out.println(calendar.get(Calendar.HOUR_OF_DAY));

        // Student s = new Student("S01", "Tan Thanh", 29);
		// System.out.println(s.getInfo());
		// System.out.println(s.get("id"));
		// System.out.println(s.get("name"));
		// System.out.println(s.get("age"));
        // System.out.println(s.get("abc"));
		
		// System.out.println();
		
		// s.set("id", "S99");
        // s.set("id", 10);
        // System.out.println(s.get("id"));
		// System.out.println(s.getInfo());
		
		// System.out.println();
		
		// s.set("name", "X");
		// System.out.println(s.get("name"));
		// System.out.println(s.getInfo());
		
		// System.out.println();
		
		// s.set("age", 10);
		// System.out.println(s.get("age"));
		// System.out.println(s.getInfo());

        String strExpirationDate = "03/06/2026 15:30:45";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try {
			Date expirationDate = sdf.parse(strExpirationDate);
            System.out.println(expirationDate.getHours());

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(expirationDate);
            System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		} catch (ParseException e) {
			e.printStackTrace();
		}

    }

}
