package lab3.model;

public abstract class Shape implements Drawable {

    String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();

    public String getShapeColor() {
        return shapeColor;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "shapeColor='" + shapeColor + '\'' +
                '}';
    }
}
