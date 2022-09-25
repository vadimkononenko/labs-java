package lab3.controller;

import lab3.model.Circle;
import lab3.model.Rectangle;
import lab3.model.Shape;
import lab3.model.Triangle;

import java.util.Arrays;
import java.util.Comparator;

public class ConsoleController {
    private final Shape[] shapes = {
            new Circle("red", 2),
            new Rectangle("blue", 2, 2),
            new Triangle("blue", 1, 2, 2),
            new Triangle("white", 2, 4, 5),
            new Rectangle("black", 3, 6),
            new Rectangle("green", 1, 3),
            new Circle("purple", 5)
    };

    public void showData() {
        Arrays.stream(shapes).forEach(System.out::println);
    }

    public Double calcAllAreas() {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calcArea();
        }
        return sum;
    }

    public <T> void calcTypedAllAreas(Class<T> clazz) {
        double sum = 0;
        for (Shape shape : shapes) {
            if (shape.getClass() == clazz) {
                sum += shape.calcArea();
            }
        }
        System.out.println(sum);
    }

    public Shape[] sortDecreaseArea() {
//        Comparator<Shape> comparator = new Comparator<>() {
//            @Override
//            public int compare(Shape o1, Shape o2) {
//                return (int) (o1.calcArea() - o2.calcArea());
//            }
//        };

        Comparator<Shape> comparator = (o1, o2) ->
                (int) (o1.calcArea() - o2.calcArea());

        Shape[] sortedShapes = this.shapes.clone();
        Arrays.sort(sortedShapes, comparator);
        return sortedShapes;
    }

    public Shape[] sortColor() {
//        Comparator<Shape> comparator = new Comparator<Shape>() {
//            @Override
//            public int compare(Shape o1, Shape o2) {
//                int res = String.CASE_INSENSITIVE_ORDER.compare(o1.getShapeColor(), o2.getShapeColor());
//                if (res == 0) {
//                    res = o1.getShapeColor().compareTo(o2.getShapeColor());
//                }
//                return res;
//            }
//        };

        Comparator<Shape> comparator = (o1, o2) -> {
            int res = String.CASE_INSENSITIVE_ORDER.compare(o1.getShapeColor(), o2.getShapeColor());
            if (res == 0) {
                res = o1.getShapeColor().compareTo(o2.getShapeColor());
            }
            return res;
        };

        Shape[] sortedShapes = this.shapes.clone();
        Arrays.sort(sortedShapes, comparator);
        return sortedShapes;
    }
}
