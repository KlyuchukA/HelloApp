package Lesson32;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public static void main(String[] args) {
        Student student = new Student("Anna", "Klyuchuk", "A", 5);
        Student student2 = new Student("Yulia", "Kolesnik", "B", 4);
        Student link = new Aspirant("Stanislav", "Anikeev", "C", 3);

        ArrayList<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student2);
        list.add(link);

        for (Student z : list) {
            z.getScholarship();
        }
    }

    public void getScholarship() {
        if (averageMark == 5) {
            System.out.println("Сумма равна 200");
        } else {
            System.out.println("Сумма равна 80");
        }
    }
}
