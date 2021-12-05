package com.sparta.model;

import com.sparta.controller.SortManager;

import java.util.ArrayList;

public abstract class Sort {
    protected long end = 0;
    protected long start = 0;
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
            SortManager.logger.warn("Array being sorted was parsed null.");
            return false;
        }
        else if(array.length <= 1){
            System.err.println("Array length is 1 or less, which is too short!");
            SortManager.logger.warn("Array being sorted had length of 1 or less, which is too short.");
            return false;
        }
        else{
            return  true;
        }
    }

    public <T extends Comparable>boolean checkIfValid(ArrayList<T> list){
        if(list == null){
            System.err.println("List is null!");
            SortManager.logger.warn("List being sorted was parsed null.");
            return false;
        }
        else if(list.size() <= 1){
            System.err.println("List length is 1 or less, which is too short!");
            SortManager.logger.warn("List being sorted had length of 1 or less, which is too short.");
            return false;
        }
        else{
            return  true;
        }
    }

    public long getEnd() {
        return end;
    }

    public long getStart() {
        return start;
    }
}
