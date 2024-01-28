package org.example;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[][] blackAndWhite = new String[8][8];

        for (int i = 0; i < blackAndWhite.length; i++) {
            for (int j = 0; j < blackAndWhite[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    blackAndWhite[i][j] = "W";
                } else {
                    blackAndWhite[i][j] = "B";
                }
                System.out.print(" " + blackAndWhite[i][j] + " ");
            }
            System.out.println();
        }
    }
}

