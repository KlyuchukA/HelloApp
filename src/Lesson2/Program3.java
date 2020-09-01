package Lesson2;

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

         if (num >= 0) {
             System.out.println (num+1) ;
         }
        if (num < 0) {
            System.out.println (num) ;
        }
//        for (int i = num; i >= 0; i++) {
//            System.out.println (i+1) ;
//        }
//
//            System.out.println(i);
//        if (num > 0)
//        {
//            num=num+1;
//        }
//        Console.WriteLine("num={0}",num);
//        Console.ReadKey(true);
    }
}