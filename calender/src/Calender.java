public class Calender {
    public static void main(String[] args) {
        Model model = new Model();
        ViewOut output = new ViewOut();
        new Controller().control(model, output);
    }
}
