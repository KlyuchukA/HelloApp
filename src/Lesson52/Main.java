package Lesson52;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое значение переменной: ");
        Scanner a = new Scanner(System.in);
        double x = a.nextDouble();

        System.out.println("Введите второе значение переменной: ");
        Scanner b = new Scanner(System.in);
        double y = b.nextDouble();

        System.out.println("Введите необходимую операцию вычисления");
        Scanner sc = new Scanner(System.in);
        OperationType type = null;

        try {
            type = OperationType.valueOf(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Нет такого типа операции");
            System.exit(0);
        }
//С помощью конструкции switch..case можно проверить принадлежность
// значения OperationType определенной константе перечисления.

        Calculator operation = null;
        switch (type) {
            case Addition:
                operation = new Addition();
                break;
            case Division:
                operation = new Division();
                break;
            case Multiplication:
                operation = new Multiplication();
                break;
            case Subtraction:
                operation = new Subtraction();
                break;
            default:
        }

        if (operation != null) {
            double result = operation.Result(x, y);
            System.out.println("Результат вычислений: " + result);
            Logger logger = operation.calculate();
            logger.log();
        }
    }
}
