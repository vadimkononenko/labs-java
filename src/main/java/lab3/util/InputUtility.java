package lab3.util;

import lab3.model.Circle;
import lab3.model.Rectangle;
import lab3.model.Shape;
import lab3.model.Triangle;
import lab3.view.ConsoleView;

import java.util.Scanner;

import static lab3.view.ConsoleView.INPUT_TYPE;

public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);
    private static ConsoleView view = new ConsoleView();

    public static String inputMenu() {
        return scanner.next();
    }

    public static Class<? extends Shape> inputType() {
        String input;
        boolean flag = true;
        Class<? extends Shape> returnValue = null;

        do {
            view.printMessage(INPUT_TYPE);
            input = scanner.next();
            switch (input) {
                case "t" -> {
                    flag = false;
                    returnValue = Triangle.class;
                }
                case "r" -> {
                    flag = false;
                    returnValue = Rectangle.class;
                }
                case "c" -> {
                    flag = false;
                    returnValue = Circle.class;
                }
            }

        } while (flag);

        return returnValue;
    }
}