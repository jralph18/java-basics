package com.company;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = scan.next();
        System.out.println("Hello " + userName + "!");

        System.out.print("Would you like to do the interactive portion? (y/yes to continue) ");
        String response = scan.next();
        if (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("yes")){
            System.out.println("Please return later to complete the survey!");
            System.exit(0);
        }
        while(true) {
            String petName;
            System.out.print("What is the name of your favorite pet? ");
            petName = scan.next();

            int petAge;
            do {
                System.out.print("How old is your favorite pet? (enter age between 0-100) ");
                while (!scan.hasNextInt()) {
                    System.out.print("That's not a number! Try again: ");
                    scan.next();
                }
                petAge = scan.nextInt();
                if (petAge < 0 || petAge > 100) System.out.println("That's out of range!");
            } while (petAge < 0 || petAge > 100);

            int luckyNum;
            do {
                System.out.print("Enter your lucky number (0-100): ");
                while (!scan.hasNextInt()) {
                    System.out.print("That's not a number! Try again: ");
                    scan.next();
                }
                luckyNum = scan.nextInt();
                if (luckyNum < 0 || luckyNum > 100) System.out.println("That's out of range!");
            } while (luckyNum < 0 || luckyNum > 100);

            int jerseyNum;
            do {
                System.out.print("Enter the jersey number of your favorite quarterback (0-99): ");
                while (!scan.hasNextInt()) {
                    System.out.print("That's not a number! Try again: ");
                    scan.next();
                }
                jerseyNum = scan.nextInt();
                if (jerseyNum < 0 || jerseyNum >= 100) System.out.println("That's out of range!");
            } while (jerseyNum < 0 || jerseyNum >= 100);

            int carYear;
            do {
                System.out.print("Enter the model year of your car (last two digits 00-99): ");
                while (!scan.hasNextInt()) {
                    System.out.print("That's not a number! Try again: ");
                    scan.next();
                }
                carYear = scan.nextInt();
                if (carYear < 0 || carYear >= 100) System.out.println("That's out of range!");
            } while (carYear < 0 || carYear >= 100);

            String actName;
            System.out.print("What is the first name of your favorite actor or actress? ");
            actName = scan.next();

            int userRandom;
            do {
                System.out.print("Enter a random number between 0 and 50: ");
                while (!scan.hasNextInt()) {
                    System.out.print("That's not a number! Try again: ");
                    scan.next();
                }
                userRandom = scan.nextInt();
                if (userRandom < 0 || userRandom > 50) System.out.println("That's out of range!");
            } while (userRandom < 0 || userRandom > 50);

            // Generate random numbers to use for lotto number generation
            Random rand = new Random();
            final int maxVal = 65;
            int randInt1 = rand.nextInt(maxVal);
            int randInt2 = rand.nextInt(maxVal);
            int randInt3 = rand.nextInt(maxVal);

            // Generate magic ball number and get it into 0-75 range
            int magicBall = randInt1 * luckyNum;
            while (magicBall > 75) {
                magicBall = Math.abs(magicBall - petAge);
            }

            // Generate lotto numbers based on user inputs
            Integer[] lottoNums = new Integer[5];
            lottoNums[0] = Math.abs(petName.charAt(2) - 60);
            lottoNums[1] = Math.abs(userRandom - randInt2);
            lottoNums[2] = (int) actName.charAt(0);
            lottoNums[3] = carYear + luckyNum;
            lottoNums[4] = Math.abs(jerseyNum - randInt3);
            // get lotto numbers into 0-65 range
            for( int i=0;i<lottoNums.length;i++){
                int randInt4 = rand.nextInt(maxVal);
                while(lottoNums[i] > 65) lottoNums[i] -= randInt4;
            }
            // Checks for duplicates and sorts
            Set<Integer> lottoSet = new HashSet<>(Arrays.asList(lottoNums));
            while(lottoSet.size() < lottoNums.length){
                lottoSet.add(rand.nextInt(maxVal));
            }
            lottoSet.toArray(lottoNums);
            Arrays.sort(lottoNums);
            // Display lotto numbers
            System.out.printf("Lottery Numbers: %d, %d, %d, %d, %d Magic Ball: %d%n", lottoNums[0], lottoNums[1], lottoNums[2],
                    lottoNums[3], lottoNums[4], magicBall);

            // Ask user to play again or terminate
            System.out.print("Would you like to generate another set of numbers? (y/yes to continue) ");
            response = scan.next();
            if (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("yes")){
                System.out.println("Thanks for playing!");
                break;
            } else {
                System.out.println("Ok! Let's go again!");
            }
        }

    }
}


