package com.sparta.cmy.sortmanager.sorts;

import com.sparta.cmy.sortmanager.interfaces.Sorter;

public class InsertionSort implements Sorter {
    public int[] insertionSort(int[] arrayOfNumbers) {

        //integer is equal to array length
        int n = arrayOfNumbers.length;
        //i = 1 so for every time i is greater than n increment by 1
        for (int i = 1; i < arrayOfNumbers.length; i++) {
            int current = arrayOfNumbers[i];
            int j = i - 1;
            while (j >= 0 && arrayOfNumbers[j] > current) {
                arrayOfNumbers[j + 1] = arrayOfNumbers[j];
                j--;
            }
            arrayOfNumbers[j + 1] = current;
        }
        return arrayOfNumbers;
    }



    @Override
    public int[] sortArray(int[] arrayToSort) {
        return insertionSort(arrayToSort);
    }
}