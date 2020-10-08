package Lesson31;

public class Cat extends Animal {

    private int paws;

    public void est() {
        System.out.println("Кошка есть медленно");
    }

    public void makeNoise() {
        System.out.println("мяу");
    }

    public Cat(String food, String location, int paws) {
        super(food, location);
        this.paws = paws;
    }
}