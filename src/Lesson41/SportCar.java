package Lesson41;

public class SportCar extends Car{
    String speed;
    Engine f;

    public SportCar (String marka, String klass, String ves, String motor, String speed, Engine f) {
        super(marka, klass, ves, motor, f);
        this.speed = speed;
    }

    public void start(){
        System.out.println("SportCar поехал");
    }
    public void stop(){
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Грузовик: " + marka + " класс" + klass + " вес "+ ves + " двигатель " + motor + " скорость " + speed + f.power + f.performance);
    }



}
