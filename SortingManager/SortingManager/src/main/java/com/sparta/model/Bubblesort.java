package com.sparta.model;

import java.util.ArrayList;

public class Bubblesort extends Sort implements Sortable {
    public <T extends Comparable>T[] sort(T[] sortArray){
        if(!checkIfValid(sortArray))
            return sortArray;
        boolean changeFound = true;
        while (changeFound) {
            changeFound = false;
            for (int i = 0; i < sortArray.length - 1; i++){
                if (sortArray[i].compareTo(sortArray[i + 1]) >= 1) {
                    swap(sortArray,i,i+1);
                    changeFound = true;
                }
            }
        }
        return sortArray;
    }

    public <T extends Comparable>ArrayList<T> sort(ArrayList<T> list){
        if(!checkIfValid(list))
            return list;
        boolean changeFound = true;
        while (changeFound){
            changeFound = false;
            for (int i = 0; i < list.size() - 1; i++){
                if (list.get(i).compareTo(list.get(i+1)) >= 1){
                    swap(list,i,i+1);
                    changeFound = true;
                }
            }
        }
        return list;
    }
}
