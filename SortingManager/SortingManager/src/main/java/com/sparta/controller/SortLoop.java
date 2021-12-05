package com.sparta.controller;

import com.sparta.model.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SortLoop {
    private static boolean calculations = false;
    private static String runningSort = "none", runningArray = "none";
    private static int arraySize = 10;

    public void sortingLoop(){
        RandomIntegerArray r = new RandomIntegerArray();
        Integer[] randomArray = new Integer[0];
        ArrayList<Integer> randomList = new ArrayList<>();

        System.out.println("Random array of integers: ");
        if (runningArray.equals("array") || runningArray.equals("both")){
            Sorting.printOut(randomArray = r.randomArray(arraySize));
        }
        else if (runningArray.equals("arraylist")){
            Sorting.printOut(randomList = r.randomArrayList(arraySize));
        }
        if (runningArray.equals("both")){
            for (int i = 0; i < arraySize; i++) randomList.add(randomArray[i]);
        }
        System.out.println();
        if (runningSort.equals("bubblesort") || runningSort.equals("all")){
            Bubblesort bubblesort = new Bubblesort();
            if (runningArray.equals("array") || runningArray.equals("both")) {
                System.out.println("Bubblesort via Arrays: ");
                Sorting.printOut(bubblesort.sort(randomArray));
                if (calculations)Sorting.calculateTime(bubblesort.getEnd(), bubblesort.getStart());
            }
            if (runningArray.equals("arraylist") || runningArray.equals("both")){
                System.out.println("Bubblesort via ArrayLists: ");
                Sorting.printOut(bubblesort.sort(randomList));
                if (calculations)Sorting.calculateTime( bubblesort.getEnd(), bubblesort.getStart());
            }
        }
        System.out.println();
        if (runningSort.equals("quicksort") || runningSort.equals("all")){
            Quicksort quicksort = new Quicksort();
            if (runningArray.equals("array") || runningArray.equals("both")){
                System.out.println("Quicksort via Arrays: ");
                Sorting.printOut(quicksort.sort(randomArray));
                if (calculations)Sorting.calculateTime(quicksort.getEnd(), quicksort.getStart());
            }
            if (runningArray.equals("arraylist") || runningArray.equals("both")){
                System.out.println("Quicksort via ArrayLists: ");
                Sorting.printOut(quicksort.sort(randomList));
                if (calculations)Sorting.calculateTime(quicksort.getEnd(), quicksort.getStart());
            }
        }
        System.out.println();
        if (runningSort.equals("treesort") || runningSort.equals("all")){
            Treesort treesort = new Treesort();
            if (runningArray.equals("array") || runningArray.equals("both")){
                System.out.println("Treesort via Arrays: ");
                Sorting.printOut(treesort.sort(randomArray));
                if (calculations)Sorting.calculateTime(treesort.getEnd(), treesort.getStart());
            }
            if (runningArray.equals("arraylist") || runningArray.equals("both")){
                System.out.println("Treesort via ArrayLists: ");
                Sorting.printOut(treesort.sort(randomList));
                if (calculations)Sorting.calculateTime(treesort.getEnd(), treesort.getStart());
            }
        }
        SortManager.logger.info("Successfully run Sortloop.");
    }

    public static void setVariables(boolean calculations, String runningSort, String runningArray, int arraySize){
        SortLoop.calculations = calculations;
        SortLoop.runningSort = runningSort;
        SortLoop.runningArray = runningArray;
        SortLoop.arraySize = arraySize;
    }
}
