package Lesson41;

public abstract class Car {
    String brand;
    String klass;
    String weight;
    String motor;
    Engine f;

    public abstract void start();
    public abstract void stop();
    public abstract void printInfo();

    public Car(String marka, String klass, String weight, String motor, Engine f) {
        this.brand = brand;
        this.klass = klass;
        this.weight = weight;
        this.motor = motor;
        this.f = f;
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }
}
