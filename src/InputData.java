public class InputData {
    private double a; // lower limit
    private double b; // upper limit
    private double precision;
    private Functions function;

    InputData(Functions function, double a, double b, double precision) {
        this.a = a;
        this.b = b;
        this.precision = precision;
        this.function = function;
    }

    public Functions getFunction() {
        return function;
    }

    public double getUpperLimit() {
        return b;
    }

    public double getLowerLimit() {
        return a;
    }

    public double getPrecision() {
        return precision;
    }
}
