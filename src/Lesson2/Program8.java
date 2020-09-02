package Lesson2;
import java.util.Arrays;
import java.util.OptionalInt;

public class Program8 {
    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;
        int otr = 0;
        int sumotr = 0;
        double avarage = 0;
        int countrotr = 0;

        int[] a = new int[]{1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
//        OptionalInt max = Arrays.stream(a).max();
//        System.out.println("Сума положительных элементов массива"+ max.getAsInt());

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sum = sum + a[i];
                counter++;
            } else if ((a[i] < 0) & (a[i] % 2 == 0)) {
                otr = otr + a[i];
            }
           if (a[i] < 0) {
                sumotr = sumotr + a[i];
                countrotr ++;
           }
        }

            avarage = (double) sumotr / (double) countrotr;

            OptionalInt max = Arrays.stream(a).max();
            System.out.println("Максимум среди положительных элементов массива"+ max.getAsInt());
            System.out.println("Сума положительных элементов массива = " + sum);
            System.out.println("Количество положительных элементов массива = " + counter);
            System.out.println("Сумма четных отрицательных элементов = " + otr);
            System.out.println("Среднее арифметическое отрицательных элементов = " + avarage);
        System.out.println("Сумма отрицательных элементов = " + sumotr);
        }
    }



