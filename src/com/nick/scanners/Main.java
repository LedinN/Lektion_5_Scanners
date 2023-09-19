package com.nick.scanners;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        do {
            System.out.println("Did this run once?");
        } while (false);

    }

    public static void scanner() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert text: ");
        sc.nextLine();

    }


}
