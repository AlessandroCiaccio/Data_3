import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = data.getYear();
        int month = data.getMonthValue();
        int day = data.getDayOfMonth();
        String dayWeek = String.valueOf(data.getDayOfWeek());
        System.out.println("The year is " + year +
                "\nThe month is " + month +
                "\nThe day of the month is " + day +
                "\nThe day of the week is " + dayWeek.toLowerCase());
    }
}
