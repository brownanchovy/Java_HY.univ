import java.time.LocalDate;
import java.time.Period;

public class Controller
{
    public void control(Model m, ViewOut o)
    {
        LocalDate today1 = m.Period_100();
        int year= m.Period_100().getYear();
        int months = today1.getMonthValue();
        int days =today1.getDayOfMonth();

        o.outPut(year,months, days);
    }
}
