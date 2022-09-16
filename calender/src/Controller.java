import java.time.LocalDate;
import java.time.Period;

public class Controller {
    public void control(Model m, ViewOut o)
    {
        int year = m.Period();
        LocalDate today = LocalDate.now();
        LocalDate xmas = LocalDate.of(year,12,25);
        Period p = Period.between(today,xmas);
        int months = p.getMonths();
        int days = p.getDays();
        o.outPut(months, days);
    }
}
