package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int userChoice;
        boolean whileFlag = true;
        String[] koreanFoodList = {"Bibimbap", "Doenjang Jjigae", "Kimbap", "Tteokbokki", "Korean-Style Bacon", "Naengmyeon ", "porridge"};
        String[] japaneseFoodList = {"Sushi", "Ramen", "Tempura", "Wagyu", "Udon", "Gyoza ", "Takoyaki"};
        Random rand = new Random();

        while (whileFlag) {
            System.out.println("-----------------------------");
            System.out.println("Random food recommendation");
            System.out.println("1. Korean Food | 2. Japanese Food | 3. Chinese Food | 4. Western Food | 5. Quit");
            System.out.println("-----------------------------");
            System.out.print("user Input: ");
            userChoice = userInput.nextInt();


            switch (userChoice) {
                case 1:
                    System.out.println(koreanFoodList[rand.nextInt(7)]);
                    System.out.println();
                    break;
                case 2:
                    System.out.println(japaneseFoodList[rand.nextInt(7)]);
                    System.out.println();
                    break;
                case 5:
                    whileFlag = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}