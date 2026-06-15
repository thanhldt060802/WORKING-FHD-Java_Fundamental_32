package bai02;

public class Utils {

    public static boolean isNotEmptyString(String str) {
        return str != null && !str.trim().isEmpty();
    }

    public static boolean isPositiveInteger(int n) {
        return n >= 0;
    }
    
}
