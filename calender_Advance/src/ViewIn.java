import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class ViewIn {
    public LocalDate y_m_d(String message) {
        String input0 = JOptionPane.showInputDialog(message);
        String input1 = JOptionPane.showInputDialog(message);
        String input2 = JOptionPane.showInputDialog(message);
        int i0 = Integer.parseInt(input0);
        int i1 = Integer.parseInt(input1);
        int i2 = Integer.parseInt(input2);
        LocalDate input = LocalDate.of(i0, i1, i2);
        return input;
    }
}
