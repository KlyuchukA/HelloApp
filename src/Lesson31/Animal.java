package Lesson31;

public class Animal {

    private String food;
    private String location;

    protected void makeNoise() {
        System.out.println("Такое-то животное орет");
    }

    protected void est() {
        System.out.println("Такое-то животное ест");
    }

    protected void sleep() {
        System.out.println("Такое-то животное спит");
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    protected String getFood() {
        return food;
    }

    protected String getLocation() {
        return location;
    }
}
