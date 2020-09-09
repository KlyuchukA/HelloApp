package Lesson41;

public class SportCar extends Car{
    String speed;

    public SportCar (String marka, String klass, String ves, String motor, String speed) {
        super(marka, klass, ves, motor);
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

    }



}
