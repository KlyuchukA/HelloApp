package Lesson7;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main (String[] args) throws IOException {

        Account first = new Account(1,"Saynukov", 9999);
        Account second = new Account(2,"Smolina", 8888);
        Account third = new Account(3,"Anikeev", 7777);
        Account fourth = new Account(4,"Klyuchuk", 6666);

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(first);
        accounts.add(second);
        accounts.add(third);
        accounts.add(fourth);

        Writer writer = null;

        try {
//            writer = new BufferedWriter(new OutputStreamWriter
//                    (new FileOutputStream("filename1.txt"), "utf-8"));
//            writer.write("1, SyaSaynukov, 9999\n");
//            writer.write("=============");
//            writer.write("2, SyaSaynukov, 9999");

            FileOutputStream fos = new FileOutputStream("newfile.txt");
//            fos = .getBytes("UTF-8");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(accounts);

            oos.flush();
            oos.close();
            System.out.println("Employee Object written to file my-data.txt");

        } catch (IOException ex) {
            // Report
        } finally {
            try {writer.close();} catch (Exception ex) {/*ignore*/}
        }

//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите номер клиента: ");
//        int num = in.nextInt();

    }

}