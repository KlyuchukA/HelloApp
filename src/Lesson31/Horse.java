package Lesson31;

public class Horse extends Animal {

    private String speed;

    public void est() {
        System.out.println("Лошадь есть сено");
    }

    public void makeNoise() {
        System.out.println("Ку-ку");
    }

    public Horse(String food, String location, String speed) {
        super(food, location);
        this.speed = speed;
    }
}
