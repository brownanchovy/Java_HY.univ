import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        String message0 = "투자 원금을 원 단위로 입려갷주세요.";
        String message1= "투자 기간을 월  단위로 입력해주세요.";
        String message2 = "월 수익률을 %단위로 입력해주세요";
        String input0 = JOptionPane.showInputDialog(message0);
        String input1= JOptionPane.showInputDialog(message1);
        String input2= JOptionPane.showInputDialog(message2);
        int money = Integer.parseInt(input0);
        int month= Integer.parseInt(input1);
        float interest =  1 + Float.parseFloat(input2) * 0.01f;
        double output0 = Math.pow(interest, month);
        double output1 = money * output0;
        //float output2= Float.parseFloat(output1);
        DecimalFormat f = new DecimalFormat("0");
        System.out.print(month + "달 뒤에 받으실 금액은");
        System.out.println(f.format(output1) + "입니다.");
    }

}
