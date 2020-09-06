package Lesson31;


public class Animal {

   String food;
   String location;

    public void makeNoise () {
        System.out.println ("Такое-то животное орет");
         }

    public void est (){
        System.out.println ("Такое-то животное ест");
    }

    public void sleep () {
        System.out.println ("Такое-то животное спит");

         }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

}
