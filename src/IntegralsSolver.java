public class IntegralsSolver {

    public static OutputData integrate(InputData inputData) {
        int a = inputData.getLowerLimit();
        int b = inputData.getUpperLimit();
        int precision = inputData.getPrecision();
        double temp = getResultOfFunction(inputData.getFunction(), 2); // test only

        return new OutputData(2.2, 12, 0.3); // test only
    }

    private static double getResultOfFunction(Functions function, double x) {
        double result = 0;
        switch (function) {
            case function1:
                result = Math.pow(Math.pow(Math.E, x), 2);
                break;
            case function2:
                result = (1 / 2 * Math.sin(x) * Math.E) / (10 * x);
                break;
            case function3:
                result = 8 + 2 * x - x * x;
                break;
        }
        return result;
    }
}
