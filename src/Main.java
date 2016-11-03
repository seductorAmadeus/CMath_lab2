public class Main {

    private static Input input = new Input();
    private static boolean dataEntered = false;
    private static boolean calculationWasSuccessfully = false;

    public static void main(String[] args) {
        InputData inputData = null;
        while (true) {
            ResultsPrinter.printMainMenu();
            switch (input.getMenuItem()) {
                case 1:
                    inputData = enterNewData();
                    break;
                case 2:
                    runTrapezoidalMethod(inputData);
                    if (calculationWasSuccessfully) {
                        return;
                    }
                    break;
                case 3:
                    Runtime.getRuntime().exit(0);
                    break;
                default:
                    System.out.println("Re-enter menu item ('1', '2' or '3'): \n");
            }
        }
    }

    private static void runTrapezoidalMethod(InputData inputData) {
        if (inputData == null || !dataEntered) {
            System.out.println("The input data is not found; enter new data \n");
        } else {
            OutputData outputData;
            outputData = IntegralsSolver.solve(inputData);
            ResultsPrinter.printOutputData(outputData);
            calculationWasSuccessfully = true;
            dataEntered = true;
        }
    }

    private static InputData enterNewData() {
        input = new Input();
        InputData inputData = input.getInputData();
        ResultsPrinter.printInputData(inputData);
        return inputData;
    }
}
