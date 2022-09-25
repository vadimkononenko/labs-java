package lab3;

import lab3.controller.ConsoleController;
import lab3.util.InputUtility;
import lab3.view.ConsoleView;

public class MVCMain {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        ConsoleController controller = new ConsoleController();

        menu(controller, view);
    }

    private static void menu(ConsoleController controller, ConsoleView view) {
        boolean flag = true;
        String input;

        do {
            view.printMessage(ConsoleView.INPUT_MENU);
            input = InputUtility.inputMenu();

            switch (input) {
                case "show" ->
                        controller.showData();
                case "calcArea" ->
                        controller.calcAllAreas();
                case "calcTyped" ->
                        controller.calcTypedAllAreas();
                case "sortDecrease" ->
                        controller.sortDecreaseArea();
                case "sortColor" ->
                        controller.sortColor();
                case "q" -> {
                    flag = false;
                    view.printGoodbye();
                }
            }
        } while (flag);
    }
}
