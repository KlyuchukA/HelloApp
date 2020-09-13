package Lesson32;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Anna", "Klyuchuk", "A", 5);
        Student student2 = new Student("Yulia", "Kolesnik", "B", 4);
        Student link = new Aspirant("Stanislav", "Anikeev", "C", 3, "Изучение Java");

        ArrayList<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student2);
        list.add(link);

        for (Student z : list) {
            z.getScholarship();
        }
    }
}

