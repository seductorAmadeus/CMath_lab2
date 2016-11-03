public class InputData {
    private int a; // lower - limit
    private int b; // upper - limit
    private int precision; // int or double?

    InputData(int a, int b) {
        this.a = a;
        this.b = b;
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
