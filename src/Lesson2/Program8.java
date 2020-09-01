package Lesson2;
import java.util.Arrays;
import java.util.OptionalInt;

public class Program8 {
    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;
//        int otr = 0;
//        int sr = 0;

        int[] a = new int[] {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        OptionalInt max = Arrays.stream(a).max();
        System.out.println(max.getAsInt());

        for (int i = 0; i < a.length; i++) {
        if (a[i] > 0) {
                sum = sum + a[i];
                counter ++;
        }
        
//        else if ((a[i] < 0) & (a[i] % 2 == 0)) {
//            otr = otr + a[i];
//            }
        }
    }
    System.out.println("Сума положительных элементов массива = "+ sum);
    System.out.println("Количество положительных элементов массива = "+ counter);
//    System.out.println("Количество положительных элементов массива = "+otr);
    }



