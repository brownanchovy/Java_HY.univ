import java.time.LocalDate;

public class ViewOut
{
    public void outPut(LocalDate date, int years, int months, int days)
    {
        System.out.print(date + "부터 100일 뒤는" + years + "년"+ months + "달 " + days + "일입니다.");

    }
}
