package lab3.view;

import lab3.controller.ConsoleController;
import lab3.model.Circle;
import lab3.model.Shape;
import lab3.model.Triangle;

public class ConsoleView {
    public static void main(String[] args) {
        ConsoleController consoleController = new ConsoleController();

        Shape[] shapes = consoleController.sortDecreaseArea();
        for (Shape shape : shapes) {
            System.out.println("AREA: " + shape.calcArea() + " | " + shape);
        }

        System.out.println("------------------------");

        consoleController.showData();

        System.out.println("------------------------");

        System.out.println("Sum of areas: " + consoleController.calcAllAreas());

        System.out.println("------------------------");

        consoleController.calcTypedAllAreas(Triangle.class);
    }
}
