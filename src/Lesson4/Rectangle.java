package Lesson4;

public class Rectangle implements Shape {
    double height;
    double width;

    public Rectangle(double a, double b) {
        this.height = a;
        this.width = b;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getSquare() {
        return height * width;
    }
}
