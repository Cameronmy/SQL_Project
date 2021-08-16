package com.sparta.cmy.sortmanager.sorts;

import com.sparta.cmy.sortmanager.interfaces.Sorter;

public class BubbleSort implements Sorter {
    public int[] bubbleSort(int[] arrayOfNumbers) {

        //for loop to say that for as long as i is less than the array length increment i
        for (int i = 0; i < arrayOfNumbers.length; i++)
            //second for loop to compare every two items of the array. j is used because it will compare i and for every iteration the largest no is created so we takeaway i because I dont need to go through it in the loop
            for (int j = 1; j < arrayOfNumbers.length - i; j++)
                //if j is smaller than the previous j then they need to be swapped
                if (arrayOfNumbers[j] < arrayOfNumbers[j - 1]) {
                    //temporary variable is created to hold the value of the smaller number
                    int temp = arrayOfNumbers[j];
                    //smaller is held in a temporary variable
                    arrayOfNumbers[j] = arrayOfNumbers[j - 1];
                    arrayOfNumbers[j - 1] = temp;

                }
        return arrayOfNumbers;
    }


    @Override
    public int[] sortArray(int[] arrayToSort) {
        return bubbleSort(arrayToSort);
    }


}







