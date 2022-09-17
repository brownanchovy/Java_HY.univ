public class Main
{
    public static void main(String[] args) {
        Model model = new Model();
        ViewOut output = new ViewOut();
        ViewIn input = new ViewIn();
        new Controller().control(input,model, output);
    }
}
