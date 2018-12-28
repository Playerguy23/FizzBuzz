package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int luku = Integer.valueOf(lukija.nextLine());

        if (luku % 3 == 0 && luku % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (luku % 3 == 0) {
            System.out.println("Fizz");
        } else if (luku % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(luku);
        }
    }
}
