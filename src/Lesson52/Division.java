package Lesson52;

public class Division extends Calculator {
    public Logger calculate() {
        return new ConsoleLogger();
    }

    public double Result(double x, double y) {
        return x / y;
    }

}
