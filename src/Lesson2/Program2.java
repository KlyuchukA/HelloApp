//Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа

package Lesson2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        int n1 = num / 100;
        int n2 = (num - (n1 * 100)) / 10;
        int n3 = num - ((n1 * 100) + (n2 * 10));
        int n4 = n1 + n2 + n3;

        System.out.println(n4);
    }
}