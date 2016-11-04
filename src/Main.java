public class Main {

    private static Input input = new Input();
    private static boolean dataEntered = false;
    private static boolean calculationWasSuccessfully = false;

    public static void main(String[] args) {
        InputData inputData = null;
        do {
            ResultsPrinter.printMainMenu();
            switch (input.getMenuItem(1, 3)) {
                case 1:
                    inputData = enterNewData();
                    break;
                case 2:
                    runTrapezoidalMethod(inputData);
                    break;
                case 3:
                    return;
            }
        } while (!calculationWasSuccessfully);
    }

    private static void runTrapezoidalMethod(InputData inputData) {
        if (inputData == null || !dataEntered) {
            System.out.println("The input data is not found; enter new data \n");
        } else {
            OutputData outputData;
            outputData = IntegralsSolver.integrate(inputData);
            ResultsPrinter.printOutputData(outputData);
            calculationWasSuccessfully = true;
            dataEntered = true;
        }
    }

    private static InputData enterNewData() {
        input = new Input();
        InputData inputData = input.getInputData();
        dataEntered = true;
        return inputData;
    }
}
