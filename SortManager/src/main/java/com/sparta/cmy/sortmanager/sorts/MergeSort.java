package com.sparta.cmy.sortmanager.sorts;

import com.sparta.cmy.sortmanager.interfaces.Sorter;

public class MergeSort implements Sorter {
    public int[] mergeSort(int[] arrayOfNumbers) {

        //return to keep the recursion going once the array of numbers is less than 2 it should stop
        if (arrayOfNumbers.length < 2) {
            return arrayOfNumbers;
        }

        //got the variables for the two array containers
        int[] array1 = new int[arrayOfNumbers.length / 2];
        int[] array2 = new int[arrayOfNumbers.length - array1.length];

        //for loop to run through array containers and populate them.
        for (int numb = 0; numb < arrayOfNumbers.length; numb++) {
            //if the loop surpasses the array that has been split then array 1 has been set
            if (numb < arrayOfNumbers.length / 2) {
                array1[numb] = arrayOfNumbers[numb];
                continue;
            }
            //array 2 made by taking that initial array of numbers that's halved and accepting the rest
            array2[numb - arrayOfNumbers.length / 2] = arrayOfNumbers[numb];
        }

        //repeating the process on both arrays.
        mergeSort(array1);
        mergeSort(array2);

        //call a method to merge two arrays together and sort them.
        merge(arrayOfNumbers, array1, array2);
        return arrayOfNumbers;
    }

    //method to sort the two arrays together
    public void merge(int[] arrayOfNumbers, int[] array1, int[] array2) {

        int array1Counter = 0;
        int array2Counter = 0;
        int arrayOfNumbCounter = 0;

        //while loop used because just need it to loop for as long as my variables are true
        while (array1Counter < arrayOfNumbers.length / 2 && array2Counter < arrayOfNumbers.length - arrayOfNumbers.length / 2) {
            //if this statement is true then I will increment the array of numbers to increase it to maximum amount of numbers
            if (array1[array1Counter] <= array2[array2Counter]) {
                arrayOfNumbers[arrayOfNumbCounter++] = array1[array1Counter++];
            }
            //if not the array1 do it for array 2
            else {
                arrayOfNumbers[arrayOfNumbCounter++] = array2[array2Counter++];
            }

        }
        //another while loop used to loop through the array of numbers again after new length
        while (array1Counter < arrayOfNumbers.length) {
            // if the first array counter is less than half the array
            if (array1Counter < arrayOfNumbers.length / 2) {
                //then the array will increase incrementally and then the array of numbers is added back to the array of numbers variable
                arrayOfNumbers[arrayOfNumbCounter++] = array1[array1Counter++];
                continue;
                //otherwise, do the same for the second array counter
            } else if (array2Counter < arrayOfNumbers.length - arrayOfNumbers.length / 2) {
                arrayOfNumbers[arrayOfNumbCounter++] = array2[array2Counter++];
                continue;

            }
            array1Counter++;
        }
    }


    @Override
    public int[] sortArray(int[] arrayToSort) {
        return mergeSort(arrayToSort);
    }
}
