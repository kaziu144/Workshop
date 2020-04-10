package com.coderslab.Work_Shop_Game_1;

import java.util.Random;
import java.util.Scanner;

public class foundNumber {
    public static void main(String[] args) {
        foundNumberStart();

    }
    public static void foundNumberStart(){

        Scanner newScan = new Scanner(System.in);
        System.out.println("Please enter number (0->>100) : ");

        Random generatorTrueValue = new Random();
        int trueValue = generatorTrueValue.nextInt((100)+1);

        while (true) {
            int yourValueNumber = 0;
            try {
                yourValueNumber = Integer.parseInt(newScan.next());
                while (!newScan.hasNextLine()) {

                }
            } catch (NumberFormatException e) {

                System.out.println("This is not a number. Please try again.");
            }

                if (yourValueNumber > trueValue) {
                    System.out.println("Too much!");
                    continue;
                } else if (yourValueNumber < trueValue) {
                    System.out.println("Too small!");
                    continue;
                }else{
                    System.out.println("Congratulation!");
                System.out.println("Your number is: " + trueValue);
                break;
                }

        }

    }
}
