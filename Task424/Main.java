package Task424;

import Task422and423.Dog;

public class Main {
    public static void main(String[] args) {
        Dogg d = new Dogg();

        d.setAge(5);
        System.out.println("Dog age: " + d.getAge());

        d.setAge(-1);  // invalid
        System.out.println("Dog age: " + d.getAge());
    }
}
