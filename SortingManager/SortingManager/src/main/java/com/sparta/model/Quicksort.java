package com.sparta.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Quicksort<T extends Comparable<T>> extends Sort implements Sortable<T> {

    public T[] sort(T[] array) {
        start = System.nanoTime();
        if(!checkIfValid(array))
            return array;
        T[] newArray = Arrays.copyOf(array, array.length);
        return quicksort(newArray, 0, array.length-1);

    }
    public ArrayList<T> sort(ArrayList<T> list){
        start = System.nanoTime();
        if(!checkIfValid(list))
            return list;
        ArrayList<T> newList = new ArrayList<>(list);
        return quicksort(newList, 0, list.size()-1);
    }
    private T[] quicksort(T[] array, int low, int high){
        int partition = partition(array, low, high);

        if(partition-1>low){
            quicksort(array, low, partition-1);
        }
        if(partition+1<high){
            quicksort(array, partition+1, high);
        }
        end = System.nanoTime();
        return array;
    }
    private ArrayList<T> quicksort(ArrayList<T> list, int low, int high){
        int partition = partition(list, low, high);

        if(partition-1>low){
            quicksort(list, low, partition-1);
        }
        if(partition+1<high){
            quicksort(list, partition+1, high);
        }
        end = System.nanoTime();
        return list;
    }
    private int partition(T[] array, int low, int high){
        T pivot = array[high];

        for(int i = low; i < high; i++){
            if(array[i].compareTo(pivot)<=-1){
                swap(array,low,i);
                low++;
            }
        }

        T temp = array[low];
        array[low] = pivot;
        array[high] = temp;

        return low;
    }
    private int partition(ArrayList<T> list, int low, int high){
        T pivot = list.get(high);

        for(int i = low; i < high; i++){
            if (list.get(i).compareTo(pivot) <= -1){
                swap(list,low,i);
                low++;
            }
        }

        T temp = list.get(low);
        list.set(low, pivot);
        list.set(high, temp);

        return low;
    }
}
