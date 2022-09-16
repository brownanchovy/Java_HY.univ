import javax.swing.text.View;
import java.time.LocalDate;
import java.time.Period;

public class Controller
{
    public void control(ViewIn n,Model m, ViewOut o)
    {
        LocalDate date = n.y_m_d("목표날짜의 년,월,일을 차례대로 입력해주세요");
        Period val1 = m.model(date);
        int years = val1.getYears();
        int months = val1.getMonths();
        int days = val1.getDays();
        o.outPut(date,years,months, days);
    }
}
