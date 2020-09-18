package Lesson63;

import java.util.ArrayList;
import java.util.Arrays;

//Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить яблоки и апельсины:
// T extends Fruit - означает, что вданном классе любые объекты, кот. наследуются от класса фрукты, где T - объекты наследники от Fruit, мы их будем использовать вместо переменной
public class Box<T extends Fruit> {

    //     Создаем коллецию
    ArrayList<T> box = new ArrayList();

    //    T... fruits - аргументы переменной длины, здесь мб какое угодно кол-во аругментов
//  позволяет работать с разным кол-вом объектов в конструкторе
    public Box(T... fruits) {
        box = new ArrayList<>(Arrays.asList(fruits));
    }

    //    Функция, кот. возвращает коллекцию, для последующего вывода коллекции на экран
    public ArrayList<T> getBox() {
        return box;
    }

    // Метод для добавления нового фрукта в корзину
    public void addFruit(T fruit) {
        box.add(fruit);
    }

    //    box.size используется для коллекций (вместо lenght)
    public float getWeight() {
        float totalWeight = 0.0f;
        for (int i = 0; i < box.size(); i++) {
//   box.get(i) - это фрукт, i - это индекс фрукта в коллекции
            totalWeight = totalWeight + box.get(i).getWeight();
        }
        return totalWeight;
    }

    //    Сравнить текущую коробку, с коробкой которая пришла в параметрах
//    getWeight это он берет той коробки, которую для которой мы в main вызываем метод compare,
//    а boxWithSomething - это так коробка, с которой в методе Compare Мы сравниваем
    public boolean compare(Box<? extends Fruit> boxWithSomething) {
        return Math.abs(this.getWeight() - boxWithSomething.getWeight()) < 0.0001f;
    }

    //     Box<T> anotherBox - мы можем использовать боксы, с любыми боксами внутри и берем оттуда из текущего
//    все и перемсываем в нашу коробку и потом очищаем тот бокс из которого пересыпали
    public void replaceFruitsToAnotherBox(Box<T> anotherBox) {
        anotherBox.box.addAll(this.box);
        this.box.clear();
    }

}

