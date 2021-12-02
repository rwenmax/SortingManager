package com.sparta.model;

import java.util.ArrayList;

public interface Sortable {
    <T extends Comparable>T[] sort(T[] array);
    <T extends Comparable>ArrayList<T> sort(ArrayList<T> list);
}
