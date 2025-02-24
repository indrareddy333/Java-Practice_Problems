package Practice_Daily;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _82_Calaender {
        public static void main(String[] args) {
            LocalDate date = LocalDate.of(2024, 4, 5);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.ENGLISH);
            String formattedDate = date.format(formatter);
            System.out.println(formattedDate);
        }
}
