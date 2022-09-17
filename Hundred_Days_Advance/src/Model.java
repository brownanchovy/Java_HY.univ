import java.time.LocalDate;
import java.time.Period;

public class Model
{
    public LocalDate model(LocalDate date)
    {
        LocalDate today = LocalDate.now();
        Period plus_100= Period.ofDays(100);
        LocalDate today1 = today.plus(plus_100);
        return today1;
    }
}
