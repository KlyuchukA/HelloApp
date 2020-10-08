package Lesson41;

public abstract class Car {
    public String brand;
    public String carClass;
    public String weight;
    public String motor;
    public Engine engine;

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public Car(String brand, String carClass, String weight, String motor, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.motor = motor;
        this.engine = engine;
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }
}
