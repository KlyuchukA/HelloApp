package Lesson5;

public class Storage extends Common{
    String manufactiry3;
    String valume2;
    String type;
    String formfactor;

    public Storage(String manufactiry3, String valume2, String type, String formfactor) {
        this.manufactiry3 = manufactiry3;
        this.valume2 = valume2;
        this.type = type;
        this.formfactor = formfactor;
    }


    public void returnObject() {
        System.out.println("Данные монитора: " + manufactiry3 + valume2 + type + formfactor);
    }
}
