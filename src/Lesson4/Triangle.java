package Lesson4;

public class Triangle implements Shape {
    double osnovanie;
    double height;

    public Triangle(double h, double a) {
        this.osnovanie = h;
        this.height = a;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getSquare() {
        return 0.5 * osnovanie * height;
    }
}

