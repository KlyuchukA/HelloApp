package Lesson32;

public class Student {
    public String firstName;
    public String lastName;
    public String group;
    public double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    protected void getScholarship() {
        if (this.averageMark == 5) {
            System.out.println("Сумма равна 200");
        } else {
            System.out.println("Сумма равна 80");
        }
    }
}


