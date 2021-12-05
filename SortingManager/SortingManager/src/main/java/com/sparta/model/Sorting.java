package com.sparta.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
    public static <T extends Comparable>void printOut(T[] array){
        if (array != null && array.length > 0)
            System.out.println(Arrays.toString(array));
        else{
            System.err.println("Trying to print with a null or empty array!");
        }
    }
    public static <T extends Comparable>void printOut(ArrayList<T> arrayList){
        if (arrayList != null && arrayList.size() > 0) {
            String string = "[" + arrayList.get(0);
            for(int i = 1; i < arrayList.size(); i++){
                string +=  ", " + arrayList.get(i);
            }
            string += "]";
            System.out.println(string);
        }
        else{
            System.err.println("Trying to print with a null or empty arrayList!");
        }
    }
    public static long calculateTime(long end, long start){
        long diff = end - start;
        if (diff >= 100000){
            double diffD = diff/1000000.0;
            if (diffD >= 100){
                diffD = diffD/1000.0;
                System.out.println(diffD + " Seconds");
            }
            else{
                System.out.println(diffD + " Miliseconds");
            }
        }
        else{
            System.out.println(diff + " Nanoseconds");
        }
        return diff;
    }
}
