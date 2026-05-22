import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {

    public static final String placeholder = "{?}";

    public static void main(String[] args) {

        // String result = completePlaceholderString("{?} Toi ten la {?}, toi {?} tuoi {?}", "3.14", "Tan Thanh", "29", "3.14");
        // if (result == null) {
        //     System.out.println("Error");
        //     return;
        // }
        // System.out.println(result);

    }

    public static String completePlaceholderString(String placeholderString, String ...values) {
        // int index = 0;
        // while(placeholderString.contains(placeholder)) {
        //     if (index >= values.length) {
        //         return null;
        //     }
        //     placeholderString = placeholderString.replaceFirst(Pattern.quote(placeholder), values[index++]);
        // }

        // return placeholderString;

        placeholderString += ".";
        String[] strs = placeholderString.split(Pattern.quote(placeholder));
        for (String str : strs) {
            System.out.println(str);
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (i - 1 >= values.length) {
                return null;
            }
            result += values[i - 1] + strs[i];
        }
        
        return result.substring(0, result.length() - 1);
    }
    
}
