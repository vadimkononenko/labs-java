package lab3.view;

import lab3.controller.ConsoleController;
import lab3.model.Circle;
import lab3.model.Rectangle;
import lab3.model.Shape;
import lab3.model.Triangle;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleView {
    public static void main(String[] args) {
        ConsoleController controller = new ConsoleController();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String input;

        do {
            input = scanner.next();

            switch (input) {
                case "show" ->
                        controller.showData();
                case "calcArea" ->
                        System.out.println(controller.calcAllAreas());
                case "calcTyped" ->
                    System.out.println(selectType(controller));
                case "sortDecrease" ->
                        Arrays.stream(controller.sortDecreaseArea())
                                .forEach(System.out::println);
                case "sortColor" ->
                        Arrays.stream(controller.sortColor())
                                .forEach(System.out::println);
                case "q" ->
                        flag = false;
            }
        } while (flag);
    }

    private static Double selectType(ConsoleController controller) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Double res = 0.0;
        boolean flag = true;

        do {
            System.out.println("Enter 't', 'r', 'c'");
            input = scanner.next();
            if (input.equals("t")) {
                flag = false;
                res = controller.calcTypedAllAreas(Triangle.class);
            }
            if (input.equals("r")) {
                flag = false;
                res = controller.calcTypedAllAreas(Rectangle.class);
            }
            if (input.equals("c")) {
                flag = false;
                res = controller.calcTypedAllAreas(Circle.class);
            }
        } while (flag);

        return res;
    }
}
