import javax.swing.*;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class ViewIn
{
    public double input(String message) {
        String input0 = JOptionPane.showInputDialog(message);
        double i0 = Double.parseDouble(input0);
        return i0;
    }
}
