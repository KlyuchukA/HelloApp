package Lesson52;

public class Multiplication extends Calculator {
    public Logger calculate() {
        return new ConsoleLogger();
    }

    public double Result(double x, double y) {
        return x * y;
    }
}
