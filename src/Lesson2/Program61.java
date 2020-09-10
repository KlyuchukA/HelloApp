package Lesson2;

import java.util.Scanner;
public class Program61 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = in.nextInt();

    //    вызывать функцию
        Program61.returnParity(num);
        Program61.returnSing(num);
    }

    // функция (int num - аргумент) - это мы передаем аргумент в функцию
    static void returnParity(int num) {
        if (num % 2 == 0) {
            System.out.println("Число четное");
        } else
            System.out.println("Число нечетное");
    }

    static void returnSing(int num) {
        if (num > 0) {
            System.out.println("Положительное");
        } else if (num == 0) {
            System.out.println("Нулевое число");
        } else
            System.out.println("Отрицательное");
    }
}
