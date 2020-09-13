package Lesson3;

public class Main {
    public static void main(String[] args) {
        Phone ph1 = new Phone("89178654540", "A", 444);
        Phone ph2 = new Phone("89276354544", "B", 555);
        Phone ph3 = new Phone("89095467444", "C", 333);

        ph1.print();
        ph2.print();
        ph3.print();

        ph1.receiveCall("Anna", "8901233333");
        ph2.receiveCall("Yulia");
        ph3.receiveCall("Sergey", ph3.getNumber());

        ph1.sendMessage("4556664666", "454545");
    }
}
