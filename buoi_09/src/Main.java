import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // String result = greeting("Le Dao Tan Thanh", 23, 1.74);
        // System.out.println(result);

        // System.out.println(greeting("Le Dao Tan Thanh", 23, 1.74));

        // int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // System.out.println(sumEven(arr));

        // greeting("Le Dao Tan Thanh", 23, 1.74);

        // int[] arr = new int[] {};
        // sumEven(arr);

        // int[] arrVar = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		// System.out.println(Arrays.toString(arrVar));
		// f(arrVar);  // arrParam = arrVar
		// System.out.println(Arrays.toString(arrVar));

        // StringBuilder sbVar = new StringBuilder("Le Dao Tan Thanh");
        // System.out.println(sbVar);
        // f(sbVar);  // sbParam = sbVar
        // System.out.println(sbVar);

        // int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // double[] b = new double[] {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        // System.out.println(sumEven(a));
        // System.out.println(sumEven(b));

        // f1("Hello", "World", "Java", "CSharp", "Python");
		
		// System.out.println();
		
		// System.out.println(f2(1, 2, 3, 4, 5, 6, 7, 8, 9));

        // int[] arr = new int[] {2, 4, 6, 8};
		// System.out.println(f1(arr));
		// System.out.println(f1(1, 2, 3, 4, 5, 6, 7, 8, 9));

        // f1("Hello", "World", "Java", "CSharp", "Python");

    }

    // public static String greeting(String name, int age, double height) {
	// 	return "My name is %s, I'm %d years old, I'm %.2f meters tall.".formatted(name, age, height);
	// }

    /**
     * Tính tổng các số chẵn trong mảng đầu vào, trả về tổng đã tính được.
     * @param arr mảng số nguyên đầu vào
     * @return tổng các số chẵn trong mảng số nguyên đầu vào
     */
    // public static int sumEven(int[] arr) {
    //     System.out.println("[DEBUG] First validating");
    //     if (arr.length == 0) {
    //         return 0;
    //     }

    //     System.out.println("[DEBUG] Start processing");
    //     int sum = 0;
    //     for (int n : arr) {
    //         if (n % 2 == 0) {
    //             sum += n;
    //         }
    //     }
    //     return sum;
    // }

    // public static void greeting(String name, int age, double height) {
	// 	String str = "My name is %s, I'm %d years old, I'm %.2f meters tall.";
	// 	System.out.println(str.formatted(name, age, height));
	// }

    // public static void sumEven(int[] arr) {
    //     if (arr.length == 0) {
    //         System.out.println("This arr is empty");
    //         return;
    //     }

    //     int sum = 0;
    //     for (int n : arr) {
    //         if (n % 2 == 0) {
    //             sum += n;
    //         }
    //     }
    //     System.out.println(sum);
    // }

    // public static void f(int[] arrParam) {
	// 	arrParam[1] = 100;
	// }

    // public static void f(StringBuilder sbParam) {
    //     sbParam.append("Hello world");
    // }

    // public static int sumEven(int[] arr) {
    //     int sum = 0;
    //     for (int n : arr) {
    //         if (n % 2 == 0) {
    //             sum += n;
    //         }
    //     }
    //     return sum;
    // }

    // public static double sumEven(double[] arr) {
    //     double sum = 0;
    //     for (double n : arr) {
    //         if (n % 2 == 0) {
    //             sum += n;
    //         }
    //     }
    //     return sum;
    // }

    // public static void f1(String ...args) {
	// 	for(String str : args) {
	// 		System.out.println(str);
	// 	}
	// }
	
	// public static int f2(int ...args) {
	// 	int sum = 0;
	// 	for(int e : args) {
	// 		sum += e;
	// 	}
	// 	return sum;
	// }

    // public static int f1(int ...args) {
	// 	int sum = 0;
	// 	for(int e : args) {
	// 		sum += e;
	// 	}
	// 	return sum;
	// }

    // public static int f1(int[] arr) {
	// 	int sum = 0;
	// 	for(int e : arr) {
	// 		sum += e;
	// 	}
	// 	return sum;
	// }

    // public static void f1(String ...args, String str) {  // Sai!
	// 	for(String s : args) {
	// 		System.out.println(s);
	// 	}
	// 	System.out.println(str);
	// }

    // public static void f1(String ...args2, String ...args1) {  // Sai!
		
	// }

    // public static void f1(String str, String ...args) {
	// 	for(String s : args) {
	// 		System.out.println(s);
	// 	}
	// 	System.out.println(str);
	// }

    /**
     * Viết hàm xử lý làm đầy dữ liệu vào một `placeholder string`, ví dụ:
     * Ta có chuỗi: "Tôi tên {?}, tôi {?} tuổi, tôi cao {?} mét"
     * Ta có các giá trị được cho: "Thành", "20", "1.74"
     * Ta cần xác định số lượng placeholder `{?}` và tiến hành làm đầy dữ liệu vào hoàn thiện chuỗi, kết quả sẽ là:
     * "Tôi tên Thành, tôi 20 tuổi, tôi cao 1.74 mét"
     * Lưu ý: Bắt lỗi trong trường hợp số lượng giá trị được cho không khớp với số lượng placeholder.
     */
    
}
