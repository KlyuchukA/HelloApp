package Lesson52;

public class Addition extends Calculator {
    public double Result(double x, double y) {
        return x + y;
    }

    public Logger calculate() {
        return new FileLogger();
    }
}


