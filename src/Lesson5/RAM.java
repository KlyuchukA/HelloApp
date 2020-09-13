package Lesson5;

public class RAM {
    String manufactiry1;
    String valume;
    String frequency;
    String type;

    public RAM (String manufactiry1, String valume, String frequency, String type) {
        this.manufactiry1 = manufactiry1;
        this.valume = valume;
        this.frequency = frequency;
        this.type = type;
    }


    public void returnRam() {
        System.out.println("Данные монитора: " + manufactiry1 + valume +  frequency + type);
    }

}

