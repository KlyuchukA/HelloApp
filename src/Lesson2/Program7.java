package Lesson2;

import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {
        double moscow_tax = 4.15, rostov_tax = 1.98, krasnodar_tax = 2.69, kirov_tax = 5;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите один из кодов города: Москва 495 или 499\n" +
                "Ростов 863\n" +
                "Краснодар 861\n" +
                "Киров 8332\n");
        int num = in.nextInt();

//        if ((num == 495) ^ (num == 499)) {
//            System.out.println("Москва. Стоимость разговора:" + moscow_tax*10);}
//        else if (num == 843) {
//            System.out.println("Ростов. Стоимость разговора:" + rostov_tax*10);}
//        else if (num == 861) {
//            System.out.println("Краснодар. Стоимость разговора:" + krasnodar_tax*10);}
//        else if (num == 8332) {
//            System.out.println("Киров. Стоимость разговора:" + kirov_tax*10);}
//           else {
//            System.out.println("Неверный код");}
//        }
// }

        switch (num) {
            case 495:
                System.out.println("Москва. Стоимость разговора:" + moscow_tax * 10);
                break;
            case 499:
                System.out.println("Москва. Стоимость разговора:" + moscow_tax * 10);
                break;
            case 843:
                System.out.println("Ростов. Стоимость разговора:" + rostov_tax * 10);
                break;
            case 861:
                System.out.println("Краснодар. Стоимость разговора:" + krasnodar_tax * 10);
                break;
            case 8332:
                System.out.println("Киров. Стоимость разговора:" + kirov_tax * 10);
                break;
            default:
                System.out.println("Неверный код");
        }
    }
}


