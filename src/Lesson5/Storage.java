package Lesson5;

public class Storage {
    public String manufactiry3;
    public String volume2;
    public String type;
    public String formfactor;

    public Storage(String manufactiry3, String valume2, String type, String formfactor) {
//        if type = "SSD"
        this.manufactiry3 = manufactiry3;
        this.volume2 = valume2;
        this.type = type;
        this.formfactor = formfactor;
    }


    public void returnStorage() {
        System.out.println("Данные монитора: " + manufactiry3 + volume2 + type + formfactor);
    }
}
