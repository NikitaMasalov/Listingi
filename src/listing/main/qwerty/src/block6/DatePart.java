package listing.main.qwerty.src.block6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DatePart {

    private Date fromDate = null;
    private SimpleDateFormat formatter = null;

    public DatePart (Date anyDate) {
        fromDate = anyDate;
        formatter = new SimpleDateFormat("EEE MM dd hh:mm:ss yyyy", Locale.getDefault());
    }
        public int getDay() {
            formatter.applyPattern("d");
            return Integer.parseInt(formatter.format(fromDate));
        }
        public int getMouth() {
            formatter.applyPattern("M");
            return Integer.parseInt(formatter.format(fromDate));
        }
        public int getYear() {
            formatter.applyPattern("Y");
            return Integer.parseInt(formatter.format(fromDate));
        }
        public int getHour() {
            formatter.applyPattern("h");
            return Integer.parseInt(formatter.format(fromDate));
        }
        public int getMinute() {
            formatter.applyPattern("m");
            return Integer.parseInt(formatter.format(fromDate));
    }


}

