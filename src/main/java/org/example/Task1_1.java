package org.example;

import java.util.Random;
import java.util.Arrays;

public class Task1_1 {
    public static void main(String[] args) {

        int a = 5, b = 6;

        int[][] twoDimArray = new int[a][b];

        Random randomNumber = new Random();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                twoDimArray[i][j] = randomNumber.nextInt(100);
            }
        }
        System.out.println(Arrays.deepToString(twoDimArray));

    }
}
