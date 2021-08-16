package com.sparta.cmy.sortmanager.Utilities;


import com.sparta.cmy.sortmanager.interfaces.Sorter;
import com.sparta.cmy.sortmanager.sorts.BinaryTree.BinaryTre;
import com.sparta.cmy.sortmanager.sorts.BubbleSort;
import com.sparta.cmy.sortmanager.sorts.InsertionSort;
import com.sparta.cmy.sortmanager.sorts.MergeSort;
import com.sparta.cmy.sortmanager.sorts.QuickSort;

import java.util.Locale;

public class SortingFactory {

    public Sorter getSort(int sort){

        switch (sort){
            case 1:
                return new BubbleSort();
            case 2:
                return new InsertionSort();
            case 3:
                return new MergeSort();
            case 4:
            default:
                return new QuickSort();
        }
    }
    public BinaryTre getTree(int sort){
        switch (sort){
            case 5:
            default:
                return new BinaryTre();
        }
    }
}
