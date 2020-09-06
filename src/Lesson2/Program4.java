//Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1; если
//        отрицательным, то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число.


package Lesson2;

import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        if (num > 0) {
            System.out.println(num + 1);
        }
        if (num < 0) {
            System.out.println(num - 2);
        }
        if (num == 0) {
            System.out.println(num = 10);
        }
    }
}
