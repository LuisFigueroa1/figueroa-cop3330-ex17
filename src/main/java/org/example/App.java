package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 17 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int gender; //declare the variable prevents the user from not entering an integer

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        gender = userInput.nextInt();

        //establish male case
        if (gender == 1) {

            double alc; //alcohol in oz
            System.out.print("How many ounces of alcohol did you have? ");
            alc = userInput.nextDouble();

            double lbs; // pounds
            System.out.print("What is your weight, in pounds? ");
            lbs = userInput.nextDouble();

            double hrs; //time
            System.out.print("How many hours has it been since your last drink? ");
            hrs = userInput.nextDouble();

            double BAC; //BAC calculation
            BAC = (alc * 5.14 / lbs * 0.73) - 0.015 * hrs;
            System.out.print("Your BAC is " + BAC);

            if (BAC < 0.08) { //case if you are able to drive
                System.out.print("\nIt is legal for you to drive.");
            } else { // if you aren't
                System.out.print("\nIt is not legal for you to drive.");
            }
        } else if (gender == 2) { //the female case
            double alc;
            System.out.print("How many ounces of alcohol did you have? ");
            alc = userInput.nextDouble();

            double lbs;
            System.out.print("What is your weight, in pounds? ");
            lbs = userInput.nextDouble();

            double hrs;
            System.out.print("How many hours has it been since your last drink? ");
            hrs = userInput.nextDouble();

            double BAC;
            BAC = (alc * 5.14 / lbs * 0.66) - 0.015 * hrs;
            System.out.print("Your BAC is " + BAC);

            if (BAC < 0.08) {
                System.out.print("\nIt is legal for you to drive.");
            }
            else {
                System.out.print("\nIt is not legal for you to drive.");
            }
        }
        else { //prevents the user from entering anything other than 1 or 2
            System.out.println("please enter 1 or 2");
        }
    }
}