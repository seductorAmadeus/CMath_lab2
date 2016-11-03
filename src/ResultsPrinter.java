public class ResultsPrinter {

    public static void printOutputData(OutputData outputData) {

    }

    public static void printInputData(InputData inputData) {

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
                        "[1] : function1\n" +
                        "[2] : function2\n" +
                        "[3] : function3\n" +
                        "Enter menu item:\n> ");
    }
}
