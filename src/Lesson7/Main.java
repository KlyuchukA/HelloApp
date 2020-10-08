package Lesson7;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int amount;
        int accountId;

        String f = "C:\\Users\\anna.klyuchuk\\Desktop\\GIT projects\\HelloApp\\collection.txt";
        try {
            AccountServiceImplementation accountService = new AccountServiceImplementation(f);
            accountService.printInfo();

            System.out.println("Введите необходимую операцию: ");
            Scanner a = new Scanner(System.in);
            String x = a.next();

            switch (x) {
                case "transfer":
                    System.out.println("Введите номер счета отправителя, номер счета получателя и сумму перевода: ");
                    Scanner b = new Scanner(System.in);
                    accountId = b.nextInt();
                    int z = b.nextInt();
                    amount = b.nextInt();
                    accountService.transfer(accountId, z, amount);
                    break;
                case "withdraw":
                    System.out.println("Введите номер счета отправителя и сумму снятия: ");
                    Scanner c = new Scanner(System.in);
                    accountId = c.nextInt();
                    amount = c.nextInt();
                    accountService.withdraw(accountId, amount);
                    break;
                case "deposit":
                    System.out.println("Введите номер счета отправителя и сумму пополнения: ");
                    Scanner d = new Scanner(System.in);
                    accountId = d.nextInt();
                    amount = d.nextInt();
                    accountService.deposit(accountId, amount);
                    break;
                case "balance":
                    System.out.println("Введите номер счета отправителя и сумму пополнения: ");
                    Scanner e = new Scanner(System.in);
                    accountId = e.nextInt();
                    accountService.balance(accountId);
                    break;
                default:
            }
        } catch (UnknownAccountException | NotEnoughMoneyException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

"80770D02A4222CC3E06790B5A8C0B01new04"