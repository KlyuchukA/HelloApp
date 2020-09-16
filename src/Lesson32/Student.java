package Lesson32;

public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;

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


