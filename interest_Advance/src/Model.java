import java.time.LocalDate;
import java.time.Period;

public class Model
{
    public double model(double i0, double i1, double i2)
    {
        double i3 = 1 + i2 * 0.01f;
        double output0 = Math.pow(i3, i1);
        double output1 = i0 * output0;
        return output1;
    }
}
