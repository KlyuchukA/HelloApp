package Lesson7;
import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main (String[] args) throws IOException {
        int amount;
        int accountId;

        String f = "C:\\Users\\anna.klyuchuk\\Desktop\\GIT projects\\HelloApp\\collection.txt";
        try  {
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
                    accountService.transfer(accountId,z,amount);
                    break;
                case "withdraw":
                    System.out.println("Введите номер счета отправителя и сумму снятия: ");
                    Scanner c = new Scanner(System.in);
                    accountId = c.nextInt();
                    amount = c.nextInt();
                    accountService.withdraw(accountId,amount);
                    break;
                case "deposit":
                    System.out.println("Введите номер счета отправителя и сумму пополнения: ");
                    Scanner d = new Scanner(System.in);
                    accountId = d.nextInt();
                    amount = d.nextInt();
                    accountService.deposit(accountId,amount);
                    break;
                case "balance":
                    System.out.println("Введите номер счета отправителя и сумму пополнения: ");
                    Scanner e = new Scanner(System.in);
                    accountId = e.nextInt();
                    accountService.balance(accountId);
                    break;
                default:
            }
        }
        catch (UnknownAccountException | NotEnoughMoneyException ex){
            System.out.println(ex.getMessage());
        }










//        Account first = new Account(1,"Saynukov", 9999);
//        Account second = new Account(2,"Smolina", 8888);
//        Account third = new Account(3,"Anikeev", 7777);
//        Account fourth = new Account(4,"Klyuchuk", 6666);
//
//        ArrayList<Account> accounts = new ArrayList<>();
//        accounts.add(first);
//        accounts.add(second);
//        accounts.add(third);
//        accounts.add(fourth);
//
//        Writer writer = null;

//        try {
//            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter
//                    (new FileOutputStream("filename1.txt"), "utf-8"));
//
//
//            writer.write("1, SyaSaynukov, 9999\n");
//            writer.newLine();
//            writer.write("2, SyaSaynukov, 9999");

//            FileOutputStream fos = new FileOutputStream("newfile.txt");
////            fos = .getBytes("UTF-8");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//            oos.writeObject(accounts);
//
//            oos.flush();
//            oos.close();
//            System.out.println("Employee Object written to file my-data.txt");
//
//        } catch (IOException ex) {
//            // Report
//        } finally {
//            try {writer.close();} catch (Exception ex) {/*ignore*/}
//        }

//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите номер клиента: ");
//        int num = in.nextInt();


    }

}
