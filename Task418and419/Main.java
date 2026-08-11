package Task418and419;

import Task416and417.Book;

import java.util.Scanner;

public  class Main {
    public  void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter car colour: ");
        String inputColour =sc.nextLine();

        System.out.println("Enter plate: ");
        String inputPlate =sc.nextLine();


        Car c = new Car();

        c.colour="Red";
        c.plate="442c";

        c.colour= inputColour;
        c.plate=inputPlate;


        System.out.println("Car colour: " + c.colour);
        System.out.println("Car plate: " + c.plate);
        c.brake();
        c.drive();

        sc.close();
    }
}
