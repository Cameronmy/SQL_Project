package com.sparta.cmy.sortmanager.Utilities;

import com.sparta.cmy.sortmanager.sorts.BubbleSort;

import java.util.Scanner;

public class Go {

    public static void Scanner() {

        SortingFactory sortingFactory = new SortingFactory();
        ArrayGen arrayGen = new ArrayGen();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick Sort Type\n 1 for Bubble, 2 for Insertion, 3 for Merge, 4 for Quick & 5 for Binary" );
        sortingFactory.getSort(scanner.nextInt());
        sortingFactory.getTree(scanner.nextInt());
        System.out.println();


        System.out.println("Specify array length from 1-10");
        arrayGen.genIntArray();
        //arrayGen.getClass();
        //arrayGen.getClass(scanner.nextInt());

        System.out.println("Specify minimum number (lowest 1)");
        arrayGen.genIntArray(scanner.nextInt());
    }

}