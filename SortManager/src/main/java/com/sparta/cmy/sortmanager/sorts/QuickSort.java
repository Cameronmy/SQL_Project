package com.sparta.cmy.sortmanager.sorts;

import com.sparta.cmy.sortmanager.interfaces.Sorter;


public class QuickSort implements Sorter {

    public static void quickSort(int[] arrayOfNumbers) {
        quickSort(arrayOfNumbers, 0, arrayOfNumbers.length - 1);
    }

    public static void  quickSort(int[] arrayOfNumbers, int left, int right){
        //call recursively
        if (left >= right){
            return;
        }
        int middle = arrayOfNumbers[(left + right) / 2];
        int index = partition(arrayOfNumbers, left, right, middle);
        quickSort(arrayOfNumbers, left, index - 1);
        quickSort(arrayOfNumbers, index, right);
    }

    public static int partition(int[] arrayOfNumbers, int left, int right, int middle) {
        while (left <= right) {
            while (arrayOfNumbers[left] < middle) {
                left++;
            }
            while (arrayOfNumbers[right] > middle
            )
                right--;
        }
        if (left < right) {
            left = right;

            left++;
            right--;
        }
        return left;
    }


    @Override
    public int[] sortArray(int[] arrayToSort) {
        return new int[0];
    }


}
