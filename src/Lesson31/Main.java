package Lesson31;
import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {

//  Создаем экземпляры класса каждого животного
    Animal animal1 = new Dog("meat", "Togliatty",4);
    Animal animal2 = new Cat ("fish", "Moskow", 4);
    Animal animal3 = new Horse("Seno", "Sochi", "60 km/h");

//   Создаем  экземпляр ветеринара для последющего вывода значений
        Veterinar veterinar = new Veterinar();

//   Создаем массив из экземпляров класса выше
        ArrayList<Animal> list = new ArrayList<>();
        list.add(animal1);
        list.add(animal2);
        list.add(animal3);

//   Через цикл Animal - вмето типа переменной, list - название массива), вызываем наши дополнительные методы
        for (Animal y: list) {
            veterinar.treatAnimal(y);
            y.makeNoise();
            y.sleep();
            y.est();
        }

    }

}
