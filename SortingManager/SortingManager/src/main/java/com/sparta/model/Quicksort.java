package com.sparta.model;

import java.util.ArrayList;

public class Quicksort extends Sort implements Sortable {

    public <T extends Comparable>T[] sort(T[] array) {
        if(!checkIfValid(array))
            return array;
        return quicksort(array, 0, array.length-1);
    }
    public <T extends Comparable>ArrayList<T> sort(ArrayList<T> list){
        if(!checkIfValid(list))
            return list;
        return quicksort(list, 0, list.size()-1);
    }
    private <T extends Comparable>T[] quicksort(T[] array, int low, int high){
        int partition = partition(array, low, high);

        if(partition-1>low){
            quicksort(array, low, partition-1);
        }
        if(partition+1<high){
            quicksort(array, partition+1, high);
        }

        return array;
    }
    private <T extends Comparable>ArrayList<T> quicksort(ArrayList<T> list, int low, int high){
        int partition = partition(list, low, high);

        if(partition-1>low){
            quicksort(list, low, partition-1);
        }
        if(partition+1<high){
            quicksort(list, partition+1, high);
        }

        return list;
    }
    private <T extends Comparable>int partition(T[] array, int low, int high){
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
    private <T extends Comparable>int partition(ArrayList<T> list, int low, int high){
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
