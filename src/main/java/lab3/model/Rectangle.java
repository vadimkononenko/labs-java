package lab3.model;

public class Rectangle extends Shape{

    private double a;
    private double b;

    public Rectangle(String shapeColor, double a, double b) {
        super(shapeColor);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calcArea() {
        return a * b;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rect...");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", shapeColor='" + shapeColor + '\'' +
                '}';
    }
}
