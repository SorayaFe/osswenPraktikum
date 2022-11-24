package de.hfu;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter text");
        String text = keyboard.nextLine();
        System.out.println(text.toUpperCase());
    }
}
