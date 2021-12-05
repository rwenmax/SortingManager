package com.sparta.model;

import java.util.ArrayList;

public interface Sortable<T extends Comparable<T>> {
    T[] sort(T[] sortArray);
    ArrayList<T> sort(ArrayList<T> list);
}
