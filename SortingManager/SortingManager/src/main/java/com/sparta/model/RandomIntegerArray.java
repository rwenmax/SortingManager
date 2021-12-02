package com.sparta.model;

import java.util.ArrayList;
import java.util.Random;

public class RandomIntegerArray<T> {
    public Integer[] randomArray(int arraySize){
        Integer[] newArray = new Integer[arraySize];
        Random r = new Random();
        for (int i = 0; i < arraySize; i++){
            newArray[i] = r.nextInt(100);
        }
        return newArray;
    }

    public ArrayList<Integer> randomArrayList(int arraySize){
        ArrayList<Integer> newArray = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < arraySize; i++){
            newArray.add(r.nextInt(100));
        }
        return newArray;
    }
}
