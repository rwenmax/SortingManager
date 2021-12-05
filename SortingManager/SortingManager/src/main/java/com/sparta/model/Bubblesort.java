package com.sparta.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Bubblesort<T extends Comparable<T>> extends Sort implements Sortable<T> {
    public T[] sort(T[] sortArray){
        start = System.nanoTime();
        if(!checkIfValid(sortArray))
            return sortArray;
        T[] newArray = Arrays.copyOf(sortArray, sortArray.length);
        boolean changeFound = true;
        while (changeFound) {
            changeFound = false;
            for (int i = 0; i < newArray.length - 1; i++){
                if (newArray[i].compareTo(newArray[i + 1]) >= 1) {
                    swap(newArray,i,i+1);
                    changeFound = true;
                }
            }
        }
        end = System.nanoTime();
        return newArray;
    }

    public ArrayList<T> sort(ArrayList<T> list){
        start = System.nanoTime();
        if(!checkIfValid(list))
            return list;
        ArrayList<T> newList = new ArrayList<>(list);
        boolean changeFound = true;
        while (changeFound){
            changeFound = false;
            for (int i = 0; i < newList.size() - 1; i++){
                if (newList.get(i).compareTo(newList.get(i+1)) >= 1){
                    swap(newList,i,i+1);
                    changeFound = true;
                }
            }
        }
        end = System.nanoTime();
        return newList;
    }
}
