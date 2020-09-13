package Lesson4;

public class Triangle implements Shape {
    public double base;
    public double height;

    public Triangle(double h, double a) {
        this.base = h;
        this.height = a;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getSquare() {
        return 0.5 * base * height;
    }
}

