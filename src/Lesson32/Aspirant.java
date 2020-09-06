package Lesson32;

public class Aspirant extends Student {
    String work;

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    public void getScholarship() {
        if (averageMark == 5) {
            System.out.println("Сумма равна 200");
        } else {
            System.out.println("Сумма равна 180");
        }
    }
}
