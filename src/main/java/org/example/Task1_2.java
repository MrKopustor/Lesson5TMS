package org.example;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber;
        do {
            System.out.println("Enter a simple integer ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error! Enter a simple integer");
                scanner.next();
            }
            userNumber = scanner.nextInt();
        } while (userNumber <= 0);

        int a = 5, b = 6;

        int[][] twoDimArray = new int[a][b];

        Random randomNumber = new Random();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                twoDimArray[i][j] = randomNumber.nextInt(100);
                twoDimArray[i][j] += userNumber;
            }
        }
        System.out.println(Arrays.deepToString(twoDimArray));
        scanner.close();
    }
}
