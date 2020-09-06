package Lesson31;

public class Cat extends Animal {

    int lapy;

    public void est() {
        System.out.println("Кошка есть медленно");
    }

    public void makeNoise() {
        System.out.println("мяу");

    }

    public Cat(String food, String location, int lapy) {
        super(food, location);
        this.lapy = lapy;
    }
}