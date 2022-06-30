
package dateDemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {
    public static void main(String[] args) {
        
        Date date = new Date();
        
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
        String currentDate = dateFormat.format(date);
        
        System.out.println("Current Date: " + currentDate);
        
    }
}
