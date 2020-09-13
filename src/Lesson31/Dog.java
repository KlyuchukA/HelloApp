package Lesson31;

public class Dog extends Animal {

    public int weight;

    public void est() {
        System.out.println("Собака ест быстро");
    }

    public void makeNoise() {
        System.out.println("ГАВ");
    }

    public Dog(String food, String location, int weight) {
        super(food, location);
        this.weight = weight;
    }
}
