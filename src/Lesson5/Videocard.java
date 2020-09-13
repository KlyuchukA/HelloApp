package Lesson5;

public class Videocard {
    private String manufactiry2;
    private String type;
    private String volume;
    private String cold;

    public Videocard(String manufactiry2, String type, String volume, String cold) {
        if (this.cold == "Passive") {
            this.manufactiry2 = manufactiry2;
            this.type = type;
            this.volume = volume;

        } else {
            this.manufactiry2 = manufactiry2;
            this.type = type;
            this.volume = volume;
            this.cold = "Active";
        }
    }

    public void returnVideocard() {
        System.out.println("Данные видеокарты: " + " " + this.manufactiry2 + " " + this.type + " " + this.volume + " " + this.cold);
    }
}

