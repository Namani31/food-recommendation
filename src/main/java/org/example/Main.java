package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int userChoice = 0;
        boolean whileFlag = true;
        String[] foodList = {"비빔밥", "된장찌개", "꽁치찌개", "김밥", "떡볶이", "삼겹살", "순두부찌개", "냉면", "해물파전", "삼계탕", "죽"};
        Random rand = new Random();

        System.out.println("-----------------------------");
        System.out.println("음식 랜덤 추천");
        System.out.println("1. 랜덤 뽑기");
        System.out.println("입력: ");
        userChoice = userInput.nextInt();

        while (whileFlag) {
            switch (userChoice) {
                case 1:
                    System.out.println(foodList[rand.nextInt(11)]);


            }
        }
    }
}