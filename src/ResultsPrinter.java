public class ResultsPrinter {

    public static void printOutputData(OutputData outputData) {
        System.out.println("\nNumber of partitions: " + outputData.getNumberOfPartitions());
        System.out.println("Result: " + outputData.getSummary());
        System.out.println("Observational error: " + outputData.getObservationalError());
    }

    public static void printMainMenu() {
        System.out.print(
                "[1] : Enter new data\n" +
                "[2] : Run trapezoidal method\n" +
                "[3] : Exit\n" +
                "Enter menu item:\n> ");
    }

    public static void printSideMenu() {
        System.out.print("Select the function, the integral of which you want to calculate: \n" +
                "[1] : " + Functions.function1.getFunctionName() + "\n" +
                "[2] : " + Functions.function2.getFunctionName() + "\n" +
                "[3] : " + Functions.function3.getFunctionName() + "\n" +
                "Enter menu item:\n> ");
    }
}
