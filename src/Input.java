import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public int getMenuItem(int firstNumberOfMenuItem, int lastNumberOfMenuItem) {
        Boolean actionWasSuccessfully = false;
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
        return new InputData(0, 2); // some test values
    }

}
