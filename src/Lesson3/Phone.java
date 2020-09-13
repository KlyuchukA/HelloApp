package Lesson3;

public class Phone {

        public String number;
        public String model;
        public int weight;

        // Void - Ничего не возвращает
        public void receiveCall(String name) {
            System.out.println("Звонит" + " " + name);
        }

        public void receiveCall(String name, String number) {
            System.out.println("Звонит" + " " + name + " " + number);
        }

        //   String - т.к. формат переменной Number string
        public String getNumber() {
            return this.number;
        }

        // Метод выводит каждый элемент из массива
        public void sendMessage(String number, String... vars) {

            System.out.println(number);

            for (String x : vars) {
                System.out.println(x);
            }
        }

        //        Проверка того, что все классы создадлись с нужными параметрами
        public void print() {

            System.out.println(this.number + " " + this.model + " " + this.weight);
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

