// Ввести три целых числа с консоли. Вывести на экран наименьшее из них.
package Lesson2;

import java.util.Scanner;

public class Program52 {

    public static void main(String[] args) {

        System.out.println("Введите три числа");
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}