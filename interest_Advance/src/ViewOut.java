import java.text.DecimalFormat;

public class ViewOut
{
    public void outPut(double months, double output1)
    {
        DecimalFormat f = new DecimalFormat("0");
        //int output2 = Integer.parseInt(f.format(output1));
        System.out.print(f.format(months) + "달 뒤에 받으실 금액은 " + f.format(output1) + "원 입니다.");

    }
}
