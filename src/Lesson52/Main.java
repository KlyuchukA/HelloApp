package Lesson52;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите необходимую операцию вычисления");
        Scanner sc = new Scanner(System.in);
        OperationType type= null;

        try {
            type = OperationType.valueOf(sc.nextLine());
                    }
        catch (Exception e) {
        System.out.println("Нет такого типа операции");
        System.exit(0);
        }

        Calculator calculate = null;
        switch (type) {
            case Addition:
                calculate = new Addition();
                break;
            case Division:
                calculate = new Division();
                break;
            case Multiplication:
                calculate = new Multiplication();
                break;
            case Subtraction:
                calculate = new Subtraction();
                break;
            default:
        }
        if (calculate != null) {

        }


    }
}
