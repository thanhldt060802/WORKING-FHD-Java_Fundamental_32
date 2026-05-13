import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // String str = "ABC";

        // char result = str.charAt(1);
        // System.out.println(result);
        // System.out.println(result);

        // System.out.println(str.charAt(5));

        // String str = "ABCDEF";
		// System.out.println(str.compareTo("ABCDEFGH"));
		// System.out.println(str.compareTo("ABC"));
		// System.out.println(str.compareTo("ABIDEF"));
		// System.out.println(str.compareTo("ABCDEF"));
		// System.out.println(str.compareTo("abcdef"));

        /**
         * ABCDEF
         * ABCDEFGH
         * 
         * 'A' - 'A' = 0
         * 'B' - 'B' = 0
         * 'C' - 'C' = 0
         * 'D' - 'D' = 0
         * 'E' - 'E' = 0
         * 'F' - 'F' = 0
         * len(ABCDEF) - len(ABCDEFGH) <=> 6 - 8 = -2
         * 
         * ABCDEF
         * ABC
         * 
         * 'A' - 'A' = 0
         * 'B' - 'B' = 0
         * 'C' - 'C' = 0
         * len(ABCDEF) - len(ABC) <=> 6 - 3 = 3
         * 
         * ABCDEF
         * ABIDEF
         * 
         * 'A' - 'A' = 0
         * 'B' - 'B' = 0
         * 'C' - 'I' <=> 67 - 73 = -6
         * 
         * ABCDEF
         * ABCDEF
         * 
         * 'A' - 'A' = 0
         * 'B' - 'B' = 0
         * 'C' - 'C' = 0
         * 'D' - 'D' = 0
         * 'E' - 'E' = 0
         * 'F' - 'F' = 0
         * len(ABCDEF) - len(ABCDEF) <=> 6 - 6 = 0
         * 
         * ABCDEF
         * abcdef
         * 
         * 'A' - 'a' <=> 65 - 97 = -32
         */
        // System.out.println("ABCD".compareTo("DEF"));

        // String str = "ABCDEF";
		// System.out.println(str.compareToIgnoreCase("abcdefgh"));
		// System.out.println(str.compareToIgnoreCase("abc"));
		// System.out.println(str.compareToIgnoreCase("abidef"));
		// System.out.println(str.compareToIgnoreCase("ABCDEF"));
		// System.out.println(str.compareToIgnoreCase("abcdef"));

        // String str = "ABCDEF";
		// System.out.println(str.concat("XYZ"));
        // System.out.println(str + "XYZ");

        // String str = "ABCDEF";
		// System.out.println(str.contains("DEF"));
		// System.out.println(str.contains("XYZ"));
        // StringBuilder strBuilder = new StringBuilder("XYZ");
        // System.out.println(str.contains(strBuilder));

        // String str = "ABCDEF";
		// System.out.println(str.startsWith("ABC"));
		// System.out.println(str.startsWith("DEF"));
        // System.out.println(str.endsWith("ABC"));
		// System.out.println(str.endsWith("DEF"));

        // String str = "ABCDEF";
		// // System.out.println(str.equals("ABC"));
		// // System.out.println(str.equals("ABCDEF"));
		// // System.out.println(str.equals("abcdef"));
        // System.out.println(str.equalsIgnoreCase("ABC"));
		// System.out.println(str.equalsIgnoreCase("ABCDEF"));
		// System.out.println(str.equalsIgnoreCase("abcdef"));

        // String str = "ABCDEF ABCDEF ABCDEF";
		// System.out.println(str.indexOf("ABC"));
		// System.out.println(str.indexOf("DEF"));
		// System.out.println(str.indexOf("XYZ"));
        // String str = "ABCDABC";
        // System.out.println(str.indexOf("DEF"));

        // String str = "ABCDEF";
		// System.out.println(str.length());

        // String str1 = "ABCDEF";
		// String str2 = "";
		// String str3 = "  ";
		// System.out.println(str1.isBlank());
		// System.out.println(str2.isBlank());
		// System.out.println(str3.isBlank());
        // // System.out.println(str1.isEmpty());
		// // System.out.println(str2.isEmpty());
		// // System.out.println(str3.isEmpty());

        // String str = "ABABAB";
		// System.out.println(str.replace("A", "XX"));
		// System.out.println(str.replace("A", ""));

        // String str = "   ABCDEF   ";
		// System.out.println(str.trim());

        // String str = "ABCDEF";
		// System.out.println(str.substring(1, 4));

        // String str = "AbCdEf";
		// System.out.println(str.toLowerCase());
        // System.out.println(str.toUpperCase());

        // String str = "ABCDEF";
		// char[] chars = str.toCharArray();
		// System.out.println(Arrays.toString(chars));
        // byte[] bytes = str.getBytes();
		// System.out.println(Arrays.toString(bytes));
        // char[] chars = new char[] {'H', 'e', 'l', 'l', 'o'};
        // String str = new String(chars);
        // System.out.println(str);
        // byte[] bytes = new byte[] {75, 34, 64, 56, 74};
        // String str = new String(bytes);
        // System.out.println(str);

        // int[] integers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // System.out.println(integers);
        // System.out.println(Arrays.toString(integers));

        // String str = "AA-BB-CC-DD-EE-FF";
		// String[] strs = str.split("-");
		// System.out.println(Arrays.toString(strs));
        // String str = "mail1@gmail.com, mail2@gmail.com, mail3@edu.vn";

        // String str = "My name is %s, I'm %d years old, I'm %.2f meters tall.";
		// System.out.println(str.formatted("Tan Thanh", 29, 1.78));
        // System.out.println(str.formatted("Hoang Phuc", 18, 1.65));

    }

}
