package Lesson5;

public class Cpu extends Common {
    String takt;
    int quantity;
    String cache;
    String memory;
    String name;
    String manufactorer;

    public Cpu(String takt, int quantity, String cache, String memory, String name, String manufactorer) {
        this.takt = takt;
        this.quantity = quantity;
        this.cache = cache;
        this.memory = memory;
        this.name = name;
        this.manufactorer = manufactorer;
    }

    public void returnObject() {
        System.out.println("Процессор: " + name + takt + quantity + cache + memory + manufactorer);
      }
    }

