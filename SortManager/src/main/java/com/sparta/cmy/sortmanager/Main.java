package com.sparta.cmy.sortmanager;

import com.sparta.cmy.sortmanager.Utilities.Go;
import com.sparta.cmy.sortmanager.sorts.MergeSort;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    //private static Logger logger = Logger.getLogger(Main.class.getName()); //can also use the project name e.g SortManager

    public static void main(String[] args) {


        //PropertyConfigurator.configure("C:\\Users\\Cameron\\IdeaProjects\\SortManager\\src\\log4j.properties");
        // write your code here
        int[] array = {4, 5, 3, 12, 7};
        //System.out.println(new MergeSort[3,5,6,1,2,7])

//        MergeSort m = new MergeSort();
//        m.mergeSort(array);
//        System.out.println(Arrays.toString(m.mergeSort(array)));
        Go.Scanner();

    }
}
