package Lesson2;

public class Program10 {
    public static void main(String[] args) {

        int[] b = new int[]{15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int swapCount = 0;
        int lastIndex = b.length - 1;//13

//     Перебираем массив, с последнего элемента, до нулевого, i-- уменьшается на 1 - тедет в обратном порядке)
        for (int i = lastIndex - 1; i >= 0; i--) {
//     Если встретил 0, то на место 0 он ставит число с конца , а вместо числа записывает 0
            if (b[i] == 0) {
                b[i] = b[lastIndex - swapCount];
                b[lastIndex - swapCount] = 0;
//      После того, как нашёл 0 увеличивает счётчик и следующий 0 меняет на предпоследний элемент в массиве, так как последнее число уже 0
                swapCount++;
            }
//      Для каждого прогона цикла выводит строку
            for (int j : b) {
                System.out.print(j + ", ");
            }
            System.out.println();
        }

        for (int i : b) {
            System.out.print(i + ", ");
        }
    }
}
