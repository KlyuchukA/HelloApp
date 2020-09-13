package Lesson52;

public abstract class Calculator {
    public int x;
    public int y;

    abstract Logger calculate();

    abstract double Result(double x, double y);
}
