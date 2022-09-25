package lab3.model;

public class Triangle extends Shape{

    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double calcArea() {
        double p = (a + b + c) / 2;
        return 0.5 * (p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle...");
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", shapeColor='" + shapeColor + '\'' +
                '}';
    }
}
