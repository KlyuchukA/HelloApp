package Lesson3;

public class Task1 {
    public class Phone {

        public String number;
        public String model;
        public int weight;


        // Void - Ничего не возвращает
        public void receiveCall(String name) {
            System.out.println("Звонит" + name);
        }

        public void receiveCall(String name, String number) {
            System.out.println("Звонит" + " " + name + " " + number);
        }

        //   String - т.к. формат переменной Number string
        public String getNumber() {
            return this.number;
        }

        // Конструктор вызывает значения второго конструктора
        public Phone(String number, String model, int weight) {
//        this.number = number;
//        this.model = model;
            this(number, model);
            this.weight = weight;

        }

        public Phone(String number, String model) {
            this.number = number;
            this.model = model;
        }

        public Phone() {
        }
    }
        public static void main (String [] args) {
            Lesson3.Phone ph1 = new Lesson3.Phone("89178654540", "A", 444);
            Lesson3.Phone ph2 = new Lesson3.Phone("89276354544", "B", 555);
            Lesson3.Phone ph3 = new Lesson3.Phone("89095467444", "C", 333);
        }
    }

