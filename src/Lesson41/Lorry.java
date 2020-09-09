package Lesson41;

public class Lorry extends Car{
    String kuzov;

    public Lorry (String marka, String klass, String ves, String motor, String kuzov, Engine f) {
        super(marka, klass, ves, motor, f);
        this.kuzov = kuzov;
    }

    public void start(){
        System.out.println("Грузовик поехал");
    }
    public void stop(){
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
      System.out.println("Грузовик: " + marka + " класс" + klass + " вес "+ ves + " двигатель " + motor + " кузов " + kuzov + f.power + f.performance);
    }
}
