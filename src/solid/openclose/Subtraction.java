package solid.openclose;

public class Subtraction implements CalculatorOperation{
    private double left;
    private double right;
    private double result = 0.0;

    public Subtraction(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void perform() {
        result = left - right;

    }

    // getters and setters
}
