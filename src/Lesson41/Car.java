package Lesson41;

public abstract class Car {
    String marka;
    String klass;
    String ves;
    String motor;
    Engine f;

    public abstract void start();
    public abstract void stop();
    public abstract void printInfo();

    public Car(String marka, String klass, String ves, String motor, Engine f) {
        this.marka = marka;
        this.klass = klass;
        this.ves = ves;
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
