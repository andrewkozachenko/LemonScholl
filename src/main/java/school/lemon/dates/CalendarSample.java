package school.lemon.dates;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarSample {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Calendar cal = new GregorianCalendar(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
