public class IntegralsSolver {

    public static OutputData integrate(InputData inputData) {
        int a = inputData.getLowerLimit(), b = inputData.getUpperLimit();
        double precision = inputData.getPrecision();
        int iterationsCounter = 1, temp;
        double h, iterationResult = 0, sum, previousIterationResult, observationalError;
        boolean limitsSwapped = false;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
            limitsSwapped = true;
        }
        h = b - a;
        do {
            previousIterationResult = iterationResult;
            sum = 0;
            for (int i = 1; i < iterationsCounter + 1; i++) {
                sum += getResultOfFunction(inputData, a + i * h);
            }
            iterationResult = h * ((getResultOfFunction(inputData, a) + getResultOfFunction(inputData, b)) * 0.5 + sum);
            observationalError = Math.abs(iterationResult - previousIterationResult) / 3;
            if (observationalError > precision) {
                h *= 0.5;
                iterationsCounter *= 2;
            }
        }
        while (observationalError > precision && iterationsCounter < Math.pow(2, 25)); // 2^25 - optimal number of iterations
        iterationResult *= limitsSwapped ? -1 : 1;
        return new OutputData(iterationResult, iterationsCounter, observationalError);
    }

    /**
     * test method only
     *
    public static void main(String[] args) {
     // test 1 == test1 * (-1) [OK]
     ResultsPrinter.printOutputData(IntegralsSolver.integrate(new InputData(Functions.function1, 15, 0, 0.123)));
     // test 2: 1.806314..., 0..15, 0.123, n = 166 [0K]
     ResultsPrinter.printOutputData(IntegralsSolver.integrate(new InputData(Functions.function1, 0, 15, 0.123)));
     // test 3: 4443416, 0..8, 0.1, n = 512 [0K]
     ResultsPrinter.printOutputData(IntegralsSolver.integrate(new InputData(Functions.function2, 0, 8, 0.1)));
     // test 4: -990, 1..16, 0.1, n = 512 [0K]
     ResultsPrinter.printOutputData(IntegralsSolver.integrate(new InputData(Functions.function3, 1, 16, 0.1)));
    }

     *
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
