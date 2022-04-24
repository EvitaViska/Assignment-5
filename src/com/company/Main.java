package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	/**
     Write a program that reads the text entered by the user, and then:
        1. checks if the word "Java" appears in the text - if so, it prints the message "Found Java" in the console,
        2. checks if the text starts with the word "Java" - if so, it prints the message "Starts with Java" in the console,
        3. checks if the text ends with the word "Java" - if so, it prints the message "Ends with Java" in the console,
        4. checks if the text equals the word "Java" - if so, prints the message "Equals Java" in the console,
        5. prints the index of the first occurrence of the word "Java" in the text in the console.

     For example, for the text "Java", the program should write in the console:
     Found Java
     Starts with Java
     Ends with Java
     Equals Java
     0

     and for the text "A java course from scratch is the best way to learn Java", the program should write in the console:
     Found Java
     Ends with Java
     52

     Get the data from the user in the console using the Scanner class.
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("What are your thoughts of programming language Java?");
        String text = scanner.nextLine();

        //1
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Found Java");
        }

        //2
        if (text.startsWith("Java")) {
            System.out.println("Starts with Java");
        }

        //3
        if (text.endsWith("Java")) {
            System.out.println("Ends with Java");
        }

        //4
        if (text.equals("Java")) {
            System.out.println("Equals Java");
        }

        //5
        System.out.println(text.indexOf("Java"));


    }
}
