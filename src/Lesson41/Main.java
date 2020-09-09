package Lesson41;

public class Main {
    public static void main(String[] args){
        Engine f = new Engine("13","4");
        Engine f1 = new Engine("2","19");

        Car[] car = new Car[2];
        car[0] = new Lorry("DAV", "A","500 kg", "350 ls", "Gruzovik", f);
        car[1] = new SportCar("Honda", "B", "350", "488 ls", "Облегченный", f1);

        for (Car c:car){
            c.printInfo();
            c.turnRight();
            c.turnLeft();
            c.start();
            c.stop();
        }
    }
}
