package com.sparta.cmy.sortmanager.Utilities;

import java.util.Random;

public class ArrayGen {

    public static int[] genIntArray(int length) {
        return genIntArray(length, 1, 1000);
    }

    public static int[] genIntArray(int length, int lowest, int highest) {

        int[] generatedArray = new int[length];

        for (int i = 0; i < generatedArray.length; i++) {
            generatedArray[i] = new Random().nextInt(highest - lowest + 1) + lowest;
        }
        return generatedArray;
    }
}
