package com.sparta.model;

import java.util.ArrayList;

public abstract class Sort {
    public <T extends Comparable>void swap(T[] array,int a, int b){
        T tempA = array[a];
        array[a] = array[b];
        array[b] = tempA;
    }
    public <T extends Comparable>void swap(ArrayList<T> list, int a, int b){
        T tempA = list.get(a);
        list.set(a,list.get(b));
        list.set(b,tempA);
    }

    public <T extends Comparable>boolean checkIfValid(T[] array){
        if(array == null){
            System.err.println("Array is null!");
            return false;
        }
        else if(array.length <= 1){
            System.err.println("Array length is 1 or less, which is too short!");
            return false;
        }
        else{
            return  true;
        }
    }

    public <T extends Comparable>boolean checkIfValid(ArrayList<T> list){
        if(list == null){
            System.err.println("Array is null!");
            return false;
        }
        else if(list.size() <= 1){
            System.err.println("Array length is 1 or less, which is too short!");
            return false;
        }
        else{
            return  true;
        }
    }
}
