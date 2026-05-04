public class Main {

    public static void main(String[] args) {

        // int a = 18;
        // int b = 4;
        // System.out.println(a + b);
        // System.out.println(a - b);
        // System.out.println(a * b);
        // System.out.println(a / b);
        // System.out.println((double)a / b);
        // System.out.println(a % b);

        // int a = -18;
        // System.out.println(+a + 2);
        // System.out.println(-a + 2);

        // // int a = 5;  // -> -a - 1
        // int a = -5;  // -> -a - 1
        // System.out.println(~a);

        // Hello -> 

        // System.out.println(~(int)'H');

        // Trục số dương: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, ...
        // Trục số âm: -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, ...

        // int a = 18;
        // int b = 4;
        // boolean result = a < b;
        // System.out.println(!result);

        // int a = 10;
        // System.out.println(++a + 1);
        // System.out.println(a);
        // System.out.println(a++ + 1);
        // System.out.println(a);

        // int a = 10;
        // // // System.out.println(a++ + (a++ + 1) * (a++ + 1)); // 10 + (11 + 1) * (12 + 1)
        // // System.out.println(++a + (++a + 1) * (++a + 1)); // 11 + (12 + 1) * (13 + 1)
        // // System.out.println(a);
        // System.out.println(a++ + (++a + 1) * (a++ + 1)); // 10 + (12 + 1) * (12 + 1)
        // System.out.println(a);

        // int a = 60;                 //    111100
        // // System.out.println(a << 3); // 111100000
        // System.out.println(a >> 3); //    111

        // int a = 25;  // 011001
        // int b = 60;  // 111100
        // System.out.println(a & b);
        // System.out.println(a | b);
        // System.out.println(a ^ b);

        // int a = 20;
		// int b = 25;
		// int c = 10;
		
		// System.out.println((b > a) && (a > c));
		// System.out.println((b > a) && (a < c));
		// System.out.println((b < a) && (a > c));
		// System.out.println((b < a) && (a < c));

        // System.out.println((b > a) || (a > c));
		// System.out.println((b > a) || (a < c));
		// System.out.println((b < a) || (a > c));
		// System.out.println((b < a) || (a < c));

        // System.out.println((b > a) & (a > c));
		// System.out.println((b > a) & (a < c));
		// System.out.println((b < a) & (a > c));
		// System.out.println((b < a) & (a < c));

        // System.out.println((b > a) | (a > c));
		// System.out.println((b > a) | (a < c));
		// System.out.println((b < a) | (a > c));
		// System.out.println((b < a) | (a < c));

        int a = 10;
        // // System.out.println((a < 5) && (++a > 10)); // (10 < 5) && (11 > 10)
        // System.out.println((a < 5) & (++a > 10)); // (10 < 5) & (11 > 10)
        // System.out.println(a);
        // System.out.println((a < 5) || (++a > 10)); // (10 < 5) || (11 > 10)
        System.out.println((a > 5) | (++a > 10)); // (10 > 5) | (11 > 10)
        System.out.println(a);

    }
    
}
