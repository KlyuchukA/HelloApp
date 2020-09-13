package Lesson52;

public class Subtraction extends Calculator {
    public Logger calculate() {
        return new DbLogger();
    }

    public double Result(double x, double y) {
        return x - y;
    }
}
