package Lesson5;

public class Monitor extends Common{
    int diagonal;
    String manufactory4;

    public Monitor(int diagonal, String manufactory4) {
        this.diagonal = diagonal;
        this.manufactory4 = manufactory4;
    }

    public void returnObject() {
        System.out.println("Данные монитора: " + diagonal + manufactory4 );
    }
}

