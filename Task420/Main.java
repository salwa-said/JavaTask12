package Task420;

import java.util.Scanner;

public class Main {
    public static  void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word =sc.nextLine();
        if (word == "yes"){
            System.out.println("used==");
        }

        if (word.equals("yes")){
            System.out.println("used .equals()");
            // this one is worked bcoz the "==" check the addresses not the actual word
        }
    }
}


