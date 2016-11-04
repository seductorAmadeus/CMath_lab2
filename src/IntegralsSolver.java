public class IntegralsSolver {

    public static OutputData integrate(InputData inputData) {
        int a = inputData.getLowerLimit();
        int b = inputData.getUpperLimit();
        double precision = inputData.getPrecision();
        double h, iterationResult = 0, sum, previousIterationResult, newPrecision;
        int iterationsCounter = 1;
        h = Math.abs(b - a);
        do {
            previousIterationResult = iterationResult;
            sum = 0;
            for (int i = 1; i < iterationsCounter + 1; i++) {
                sum += getResultOfFunction(inputData, a + i * h);
            }
            iterationResult = h * ((getResultOfFunction(inputData, a) + getResultOfFunction(inputData, b)) * 0.5 + sum);
            newPrecision = Math.abs(iterationResult - previousIterationResult) / 3;
            if (newPrecision > precision) {
                h *= 0.5;
                iterationsCounter *= 2;
            }
        }
        while (newPrecision > precision && iterationsCounter < Math.pow(2, 24)); // 2^24 - maximum number of iterations
        return new OutputData(iterationResult, iterationsCounter, newPrecision);
    }
    /**
     * test method only
     */
    public static void main(String[] args) {
        ResultsPrinter.printOutputData(IntegralsSolver.integrate(new InputData(Functions.function1, 0, 15, 1)));
        ResultsPrinter.printOutputData(IntegralsSolver.integrate(new InputData(Functions.function2, 0, 3, 1)));
        ResultsPrinter.printOutputData(IntegralsSolver.integrate(new InputData(Functions.function3, 1, 16, 0.12)));
    }
    /**
     * end of test method
     */
    private static double getResultOfFunction(InputData inputData, double x) {
        double result = 0;
        switch (inputData.getFunction()) {
            case function1:
                result = Math.pow(Math.E, Math.pow(-x, 2)) - Math.cos(7 * x + Math.PI / 2);
                break;
            case function2:
                result = Math.pow(Math.pow(Math.E, x), 2);
                break;
            case function3:
                result = 8 + 2 * x - x * x;
                break;
        }
        return result;
    }
}
