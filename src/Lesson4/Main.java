package Lesson4;


public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(1, 3);
        shape[1] = new Circle(2);
        shape[2] = new Rectangle(7, 3);

        for (Shape sh : shape) {

            System.out.println("Name: " + sh.getName());
            System.out.println("Площадь фигуры: " + sh.getSquare());

        }
    }
}

