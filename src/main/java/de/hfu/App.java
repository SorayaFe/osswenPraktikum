package de.hfu;

import java.util.Scanner;

/**
 * Test class
 */
public class App {
    /**
     * Read keyboard input and print to console in uppercase
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter text");
        String text = keyboard.nextLine();
        System.out.println(text.toUpperCase());
    }
}
