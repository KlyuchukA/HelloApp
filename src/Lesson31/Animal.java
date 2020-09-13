package Lesson31;

public class Animal {

    private String food;
    private String location;

    public void makeNoise() {
        System.out.println("Такое-то животное орет");
    }

    public void est() {
        System.out.println("Такое-то животное ест");
    }

    public void sleep() {
        System.out.println("Такое-то животное спит");
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
