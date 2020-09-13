package Lesson41;

public class SportCar extends Car {
    public String speed;

    public SportCar(String brand, String klass, String weight, String motor, String speed, Engine f) {
        super(brand, klass, weight, motor, f);
        this.speed = speed;
    }

    public void start() {
        System.out.println("SportCar поехал");
    }

    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Грузовик: " + brand + " класс" + klass + " вес " + weight + " двигатель " + motor + " скорость " + speed + "сила" + this.f.power + "выполняемость" + this.f.performance);
    }


}
