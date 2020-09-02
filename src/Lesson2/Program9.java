package Lesson2;
import java.util.Arrays;

public class Program9 {

    public static void main (String[] args) {
        int[] a = new int[]{15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        for ( int i = 0, j = a.length - 1; i < j; ++i, --j ) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }

        for ( int i : a )
            System.out.print(i + " ");

        System.out.println();

    }
}
