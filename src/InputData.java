public class InputData {
    private int a; // lower limit
    private int b; // upper limit
    private double precision;
    private Functions function;

    InputData(Functions function, int a, int b, double precision) {
        this.a = a;
        this.b = b;
        this.precision = precision;
        this.function = function;
    }

    public Functions getFunction() {
        return function;
    }
    
    public int getUpperLimit() {
        return b;
    }

    public int getLowerLimit() {
        return a;
    }

    public double getPrecision() {
        return precision;
    }
}
