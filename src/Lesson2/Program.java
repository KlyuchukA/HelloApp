package Lesson2;

import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        String num = in.nextLine();

        System.out.println("last character: " +
                num.substring(num.length() - 1));
    }
}


