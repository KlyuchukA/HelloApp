package Lesson2;
import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = in.nextInt();
        System.out.println (sumDigitsInNumber(number));
    }

        public static int sumDigitsInNumber (int number){
            String numberS = Integer.toString(number);
            String[] a = numberS.split("");
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += Integer.parseInt(a[i]);
            }
            return sum;
        }
    }

