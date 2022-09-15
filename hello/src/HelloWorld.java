public class HelloWorld
{
    public static void main(String[] args) {
        Model m = new Model();
        View v = new View();
        new Controller().control(m,v);

    }
}
