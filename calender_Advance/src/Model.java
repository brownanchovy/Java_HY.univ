import java.time.LocalDate;
import java.time.Period;

public class Model
{
    public Period  model(LocalDate date)
    {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        Period p = Period.between(today,date);
        return p;
    }
}
