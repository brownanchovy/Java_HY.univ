import java.time.LocalDate;
import java.time.Period;

public class Controller
{
    public void control(ViewIn n,Model m, ViewOut o)
    {
        LocalDate date = n.y_m_d("원하시는 날짜의 년,월,일을 차례대로 입력해주세요");
        LocalDate val1 = m.model(date);
        int years = val1.getYear();
        int months = val1.getMonthValue();
        int days = val1.getDayOfMonth();
        o.outPut(date,years,months, days);
    }
}
