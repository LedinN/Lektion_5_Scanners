package com.nick.scanners;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Objects
        Scanner sc = new Scanner(System.in);
        Student benny = new Student();

        // Game
        do {

            System.out.println("Input Bennys age: ");
            int result = sc.nextInt();

            benny.age = result;

            System.out.println("You picked: " + result);
            System.out.println("Bennys age is: " + benny.age);

        } while (true);
    }
}