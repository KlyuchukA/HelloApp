package Lesson5;

public class Storage {
    private String manufactiry3;
    private String volume2;
    private String type;
    private String formfactor;

    public Storage(String manufactiry3, String valume2, String type, String formfactor) {
        if (this.type == "SSD") {
            this.manufactiry3 = manufactiry3;
            this.volume2 = valume2;
            this.formfactor = formfactor;
        } else {
            this.manufactiry3 = manufactiry3;
            this.volume2 = valume2;
            this.formfactor = formfactor;
            this.type = "HDD";
        }
    }


    public void returnStorage() {
        System.out.println("Данные накопителя: " + " " + manufactiry3 + " " + volume2 + " " + type + " " + formfactor);
    }
}
