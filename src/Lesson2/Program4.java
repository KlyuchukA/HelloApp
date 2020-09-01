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
            if (num < 0 ) {
                System.out.println(num-2);
            }
            if (num == 0 ) {
                System.out.println(num = 10);
            }
        }
}
