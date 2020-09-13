package Lesson41;

public class Main {
    public static void main(String[] args) {
        Engine f = new Engine("13", "4");
        Engine f1 = new Engine("2", "19");

        Car[] cars = new Car[2];
        cars[0] = new Lorry("DAV", "A", "500 kg", "350 ls", "Gruzovik", f);
        cars[1] = new SportCar("Honda", "B", "350", "488 ls", "Облегченный", f1);

        for (Car car : cars) {
            car.printInfo();
            car.turnRight();
            car.turnLeft();
            car.start();
            car.stop();
        }
    }
}
