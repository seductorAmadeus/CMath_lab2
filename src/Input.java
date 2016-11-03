import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public int getMenuItem(int firstNumberOfMenuItem, int lastNumberOfMenuItem) {
        boolean actionWasSuccessfully = false;
        int menuItem = 0;
        do {
            try {
                Scanner menuItemIn = new Scanner(System.in);
                menuItem = menuItemIn.nextInt();
                if (menuItem > lastNumberOfMenuItem || menuItem < firstNumberOfMenuItem)
                    throw new NumberFormatException();
                actionWasSuccessfully = true;
            } catch (NumberFormatException | InputMismatchException exp) {
                System.out.print("Format error, re-enter menu item (it must be an integer; [" + firstNumberOfMenuItem + "," + lastNumberOfMenuItem + "]):\n> ");
            }
        } while (!actionWasSuccessfully);
        return menuItem;
    }

    public InputData getInputData() {
        Scanner in = new Scanner(System.in);
        int a, b, precision;
        Functions function = null;
        ResultsPrinter.printSideMenu();

        switch (getMenuItem(1, 3)) {
            case 1:
                function = Functions.function1;
                break;
            case 2:
                function = Functions.function2;
                break;
            case 3:
                function = Functions.function3;
                break;
        }

        do {
            System.out.print("Enter a lower limit of integration:\n> ");
            try {
                a = Integer.valueOf(in.nextLine());
                break;
            } catch (NumberFormatException exp) {
                System.out.println("Format error;");
            }
        } while (true);

        do {
            System.out.print("Enter a upper limit of integration:\n> ");
            try {
                b = Integer.valueOf(in.nextLine());
                break;
            } catch (NumberFormatException exp) {
                System.out.println("Format error;");
            }
        } while (true);

        do {
            System.out.print("Enter a precision\n> ");
            try {
                precision = Integer.valueOf(in.nextLine());
                break;
            } catch (NumberFormatException exp) {
                System.out.println("Format error;");
            }
        } while (true);

        return new InputData(function, a, b, precision);
    }
}
