
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

// understanding the concept of Date & Time API
public class DateTimeExample {
    public static void main(String[] args) {
        //display current date and current time

        LocalDate currentdate = LocalDate.now();
        System.out.println("Current Date "+currentdate);

        LocalTime currenttime = LocalTime.now();
        System.out.println("Current Time "+currenttime);

        ZonedDateTime currentdatetime = ZonedDateTime.now();
        System.out.println("Current Date and Time is "+currentdatetime);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Local Date and Time "+dateTime);
    }
}