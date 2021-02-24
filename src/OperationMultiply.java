public class OperationMultiply extends Operation {
    @Override
    public void execute(double a, double b) {
        double out = a * b;
        System.out.println("a * b = " + out);
    }
}