package Task425;

import Task418and419.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double a =scanner.nextDouble();

        Payment payment = new Payment();


        payment.setAmount(a);
        System.out.println("The amount: " +payment.getAmount());


    }
}
