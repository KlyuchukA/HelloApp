package Lesson7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

public interface AccountService {


//     void balance(int accountId) throws UnknownAccountException{
//
//         System.out.println ("Баланc счета: " + balance());
//    }


    public static Account read() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("collection.txt"))) {
            String str = reader.readLine();
            String[] arr = str.split("\\|");

            return new Account(arr[0], Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]));



        } catch (IOException ex) {
            ex.printStackTrace();
            throw ex;
        }

        System.out.print("\nВывод элементов массива myList: ");
        for (int i = 0; i < arr.size; i++) {
            System.out.print(arr[i] + ", ");
        }

    }

}
