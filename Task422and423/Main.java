package Task422and423;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main() {
         List<AnimalBehaviour> animal = new ArrayList<>();
         Cat cat = new Cat();
         animal.add(cat);

         Dog dog = new Dog();
         animal.add(dog);

         for (AnimalBehaviour a: animal){
             a.makeSound();
         }


    }
}
