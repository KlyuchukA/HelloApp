package Lesson2;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

//   логика определения четности и знака числа не пересекалась.
        if ((num < 0) && (num % 2 == 0)) {
            System.out.println("отрицательное четное число");
        } else if ((num < 0) && (!(num % 2 == 0))) {
            System.out.println("отрицательное нечетное число");
        } else if (num == 0) {
            System.out.println("нулевое число");
        } else if ((num > 0) && (num % 2 == 0)) {
            System.out.println("положительное четное число");
        } else {
            System.out.println("положительное нечетное число");
        }
    }
}


