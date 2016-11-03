public class InputData {
    private int a; // lower limit
    private int b; // upper limit
    private int precision; // int or double?
    private Functions function;

    InputData(Functions function, int a, int b, int precision) {
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

    public int getPrecision() {
        return precision;
    }
}
