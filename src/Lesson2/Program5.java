// Ввести три целых числа с консоли. Вывести на экран наименьшее из них.

package Lesson2;

import java.util.Scanner;
import java.util.Arrays;

public class Program5 {
    public static void main(String[] args) {

        System.out.println("Введите три числа");
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(numbers[0]);
        sc.close();
    }
}


//        Scanner in = new Scanner(System.in);
//        System.out.print("Input value 1: ");
//        int a = in.nextInt();
//
//        System.out.print("Input value 2: ");
//        int b = in.nextInt();
//
//        System.out.print("Input value 3: ");
//        int c = in.nextInt();


