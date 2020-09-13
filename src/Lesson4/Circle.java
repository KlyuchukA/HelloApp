package Lesson4;

public class Circle implements Shape {
    public double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getSquare() {
        return radius * radius * Math.PI;
    }

}
