package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String password;

        // creates new instance of Scanner class
        Scanner in = new Scanner(System.in);

        // gets user inputs
        System.out.print("Type your name: ");
        String name = in.nextLine();
        System.out.print("Type your surname: ");
        String surname = in.nextLine();
        System.out.print("Type your favorite color: ");
        String favColor = in.nextLine();
        System.out.print("Type your birth year: ");
        int birthYear = in.nextInt();
        System.out.print("Type your birth month: ");
        int birthMonth = in.nextInt();
        System.out.print("Type your birth day: ");
        int birthDay = in.nextInt();

        // generates password and prints on screen
        int birthdateSum = birthYear + birthMonth + birthDay;
        password = name + "-" + surname + "-" + favColor + "-" + birthdateSum;
        System.out.println(password);

    }
}
