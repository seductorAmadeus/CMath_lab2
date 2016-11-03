import java.util.Scanner;

public class Input {

    public int getMenuItem() {
        Boolean actionWasSuccessfully = false;
        Integer menuItem = null;
        while (true) {
            try {
                Scanner menuItemIn = new Scanner(System.in);
                menuItem = menuItemIn.nextInt();
                actionWasSuccessfully = true;
            } catch (NumberFormatException exp) {
                System.out.println("Format error, re-enter menu item (1, 2, or 3): ");
            } catch (Exception exp) {
                System.out.println("Format error, re-enter menu item (1, 2, or 3): ");
            }
            if (actionWasSuccessfully) {
                break;
            }
        }
        return menuItem;
    }

    public InputData getInputData() {

        return new InputData(0, 2); // some test values
    }

}
