package lab3.view;

import lab3.model.Shape;

import java.util.Arrays;

public class ConsoleView {
    public static final String INPUT_MENU =
            "Enter 'show', 'calcArea', 'calcTyped', 'sortDecrease', 'sortColor' or 'q' to quit \n";

    public static final String INPUT_TYPE = "Enter 't', 'r' or 'c'";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printShapes(Shape[] shapes) {
        System.out.println("Shapes:");
        Arrays.stream(shapes).forEach(System.out::println);
        System.out.println();
    }

    public void printAreas(Double area) {
        System.out.println("Sum of all shape area: " + area + "\n");
    }

    public void printAreasForTyped(String shapeType, Double area) {
        System.out.println("Sum area of " + shapeType + " : " + area + "\n");
    }

    public void printSortedDecrease(Shape[] shapes) {
        System.out.println("Sorted decrease shapes:");
        Arrays.stream(shapes).forEach(System.out::println);
        System.out.println();
    }

    public void printSortedColor(Shape[] shapes) {
        System.out.println("Sorted by color shapes:");
        Arrays.stream(shapes).forEach(System.out::println);
        System.out.println();
    }

    public void printGoodbye() {
        System.out.println("Bye!");
    }
}
