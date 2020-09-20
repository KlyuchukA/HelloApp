package Lesson7;

import java.io.*;
import java.util.ArrayList;

public class AccountServiceImplementation implements AccountService {


    ArrayList<Account> accounts = new ArrayList<>();

    //    String f - путь до файла
    public AccountServiceImplementation(String f) throws IOException {
//    Создаем объект типа file
        File g = new File(f);
        if (!g.exists()) {
            try {
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter
                        (new FileOutputStream("filename.txt"), "utf-8"));

                writer.write("1, SyaSaynukov, 9999\n");
                writer.newLine();
                writer.write("2, SyaSaynukov, 9999");

            } catch (
                    IOException ex) {
                ex.printStackTrace();
                throw ex;
            }
        }
         try {
//   Передали в поток для чтения наш файл g
                BufferedReader reader = new BufferedReader(new FileReader(g));
                String str;

                //  Считывает по линиям, будет читать пока будут строки заполнены
//   пока следущая строка не пустая выполняется цикл
                while ((str = reader.readLine()) != null) {


//  Будет массив типа String и каждый эелемент будет со своим индексом
                    String[] arr = str.split(",");

//    Добавление новых элементов из файла в коллекцию
                    accounts.add(new Account(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2])));
                }
            } catch (
                    IOException ex) {
                ex.printStackTrace();
                throw ex;
            }
        }

    public void printInfo() {
        System.out.print("\nВывод элементов массива: ");
        for (Account account : accounts) {
            account.print();
        }
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException {

        if (comparing(accountId) == false) {
            throw new UnknownAccountException();
        } else {
            for (Account account : accounts) {
                if (account.getAccount() == accountId) {
                    System.out.println(account.getAmount());
                }
            }
        }
    }

//        Вызвать эксепшен, если кол-во найденных аккаунтов 0, то он вызывет эксепшен
//        создать новый метод, который возвращает тру илбо фолс

    public boolean comparing(int accountId) {
        boolean decision = false;

        for (Account account : accounts) {
            if (account.getAccount() == accountId) {
                decision = true;
            }
        }
        return decision;
    }

    @Override
    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        int newAmount;

        if (comparing(accountId) == false || (comparingBalance(accountId) < amount)) {

            if (comparing(accountId) == false) {
                throw new UnknownAccountException();
            } else throw new NotEnoughMoneyException();
        } else {
            for (Account account : accounts) {
                if (account.getAccount() == accountId) {
                    newAmount = (account.getAmount() - amount);
                    account.setAmount(newAmount);
                    System.out.println("Остаток средств: " + account.getAmount());
                }
            }
        }
    }


    public int comparingBalance(int accountId) {
        int desicionBalance = 0;

        for (Account account : accounts) {
            if (account.getAccount() == accountId) {
                desicionBalance = account.getAmount();
            }
        }
        return desicionBalance;
    }

    @Override
    public void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        int newAmount;

//        можно ли вынести переменную newAmount в общий????
        if (comparing(accountId) == false || amount == 0) {

            if (comparing(accountId) == false) {
                throw new UnknownAccountException();
            } else throw new NotEnoughMoneyException();
        } else {
            for (Account account : accounts) {
                if (account.getAccount() == accountId) {
                    newAmount = (account.getAmount() + amount);
                    account.setAmount(newAmount);
                    System.out.println("Остаток средств: " + account.getAmount());
                }
            }
        }
    }

    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        withdraw(from, amount);
        deposit(to, amount);

    }
}






