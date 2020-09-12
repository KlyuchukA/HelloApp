package Lesson5;

public class Videocard extends Common{
    String manufactiry2;
    String type;
    String volume;
    String cold;

    public Videocard(String manufactiry2, String type, String volume, String cold) {
      this.manufactiry2 = manufactiry2;
      this.type = type;
      this.volume = volume;
      this.cold = cold;
    }


    public void returnObject() {
        System.out.println("Данные монитора: " + manufactiry2 + type + volume + cold);
    }
}
