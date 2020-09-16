package Lesson32;

public class Aspirant extends Student {
    private String work;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    public void getScholarship() {
        if (this.averageMark == 5) {
            System.out.println("Сумма равна 200");
        } else {
            System.out.println("Сумма равна 180");
        }
    }
}
