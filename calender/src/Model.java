import java.time.LocalDate;

public class Model {
    int Period()
    {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        return year;
    }
}
