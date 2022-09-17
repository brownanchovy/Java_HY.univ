import java.time.LocalDate;

public class Controller
{
    public void control(ViewIn n,Model m, ViewOut o)
    {
        double val0 = n.input("투자 원금을 원 단위로 입력해주세요");
        double val1 = n.input("투자 기간을 월 단위로 입력해주세요");
        double val2 = n.input("월 수익률을 % 단위로 입력해주세요");
        double ans0 = m.model(val0, val1, val2);
        o.outPut(val1, ans0);
    }
}
