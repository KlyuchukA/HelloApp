package Lesson41;

public class Main {
    public static void main(String[] args){
        Car[] car = new Car[2];
        car[0] = new Lorry("DAV", "A","500 kg", "350 ls", "Gruzovik");
        car[1] = new SportCar("Honda", "B", "350", "488 ls", "Облегченный");

        for (Car c:car){
            c.printInfo();
        }
    }
}
