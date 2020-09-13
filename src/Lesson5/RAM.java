package Lesson5;

public class RAM {
    private String manufactiry1;
    private String valume;
    private String frequency;
    private String type;

    public RAM (String manufactiry1, String valume, String frequency, String type) {
        this.manufactiry1 = manufactiry1;
        this.valume = valume;
        this.frequency = frequency;
        this.type = type;
    }


    public void returnRam() {
        System.out.println("Данные оперативной памяти: " + " " + manufactiry1 + " " + valume + " " +  frequency + " " + type);
    }

}

