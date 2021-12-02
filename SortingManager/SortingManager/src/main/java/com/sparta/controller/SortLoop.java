package com.sparta.controller;

import com.sparta.model.Bubblesort;
import com.sparta.model.Quicksort;
import com.sparta.model.RandomIntegerArray;
import com.sparta.model.Sorting;

import java.util.ArrayList;

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
        if (runningSort.equals("bubblesort") || runningSort.equals("both")){
            Bubblesort bubblesort = new Bubblesort();
            if (runningArray.equals("array") || runningArray.equals("both")) {
                System.out.println("Bubblesort via Arrays: ");
                Sorting.printOut(bubblesort.sort(randomArray));
            }
            if (runningArray.equals("arraylist") || runningArray.equals("both")){
                System.out.println("Bubblesort via ArrayLists: ");
                Sorting.printOut(bubblesort.sort(randomList));
            }
        }
        System.out.println();
        if (runningSort.equals("quicksort") || runningSort.equals("both")){
            Quicksort quicksort = new Quicksort();
            if (runningArray.equals("array") || runningArray.equals("both")){
                System.out.println("Quicksort via Arrays: ");
                Sorting.printOut(quicksort.sort(randomArray));
            }
            if (runningArray.equals("arraylist") || runningArray.equals("both")){
                System.out.println("Quicksort via ArrayLists: ");
                Sorting.printOut(quicksort.sort(randomList));
            }
        }
    }

    public static void setVariables(boolean calculations, String runningSort, String runningArray, int arraySize){
        SortLoop.calculations = calculations;
        SortLoop.runningSort = runningSort;
        SortLoop.runningArray = runningArray;
        SortLoop.arraySize = arraySize;
    }
}
