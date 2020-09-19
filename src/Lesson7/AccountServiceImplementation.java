package Lesson7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AccountServiceImplementation implements AccountService {

    ArrayList<Account> accounts = new ArrayList<>();

    //    String f - путь до файла
    public AccountServiceImplementation(String f) throws IOException {
//    Создаем объект типа file
        File g = new File(f);
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

}


