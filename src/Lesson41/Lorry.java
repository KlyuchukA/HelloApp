package Lesson41;

public class Lorry extends Car {
    public String body;

    public Lorry(String brand, String klass, String weight, String motor, String body, Engine f) {
        super(brand, klass, weight, motor, f);
        this.body = body;
    }

    public void start() {
        System.out.println("Грузовик поехал");
    }

    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Грузовик: " + brand + " класс" + klass + " вес " + weight + " двигатель " + motor + " кузов " + body + "сила" + this.f.power + "выполняемость" + this.f.performance);
    }
}
