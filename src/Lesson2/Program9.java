package Lesson2;
public class Program9 {

    public static void main (String[] args) {
        int[] a = new int[]{15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        //  он проходится по i=0 - первый элемент массива, J - оследний (тк. массив начинается с 0 эелемента, а длина считаетмся с 1), сравнивает номера желементов и выводит для i следующий,
        //  а для j следующий с другого конца
        for ( int i = 0, j = a.length - 1; i < j; ++i, --j ) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }

//        Для каждого элемента int из массива а вывести на экран значение int
        for ( int i : a )
            System.out.print(i + " ");

        System.out.println();

    }
}
