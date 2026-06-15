package bai05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    public static final String VN_DATE_FORMAT = "dd/MM/yyyy";

    public static int compareDateString(String dateStr1, String dateStr2, String dateFormat) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        Date date1 = sdf.parse(dateStr1);
        Date date2 = sdf.parse(dateStr2);
        return date1.compareTo(date2);
    }
    
}
