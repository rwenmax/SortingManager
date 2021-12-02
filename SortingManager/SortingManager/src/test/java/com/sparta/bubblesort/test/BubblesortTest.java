package com.sparta.bubblesort.test;

import com.sparta.model.Bubblesort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubblesortTest {
    @DisplayName("Testng with a set integer array of length 10")
    @Test
    public void integerArray10(){
        Integer[] testingArray = {5,8,3,7,4,7,3,7,3,5};
        Integer[] expectedArray = {3,3,3,4,5,5,7,7,7,8};

        Bubblesort bubblesort = new Bubblesort();
        bubblesort.sort(testingArray);

        String testingString = Arrays.toString(testingArray);
        String expectedString = Arrays.toString(expectedArray);

        assertEquals(testingString, expectedString);
    }

    @DisplayName("Testng with a set char array of length 10")
    @Test
    public void charArray10(){
        Character[] myArray1 = {'g','n','y','c','a','g','s','m','v','u'};
        Character[] myArray2 = {'a','c','g','g','m','n','s','u','v','y'};
        Bubblesort bubblesort = new Bubblesort();
        bubblesort.sort(myArray1);
        bubblesort.sort(myArray2);

        String testingArray1 = Arrays.toString(myArray1);
        String testingArray2 = Arrays.toString(myArray2);

        assertEquals(testingArray1, testingArray2);
    }

    @DisplayName("Testng with a set number arrayList of length 10")
    @Test
    public void charArrayList10(){
        ArrayList<Integer> myArray1 = new ArrayList<>();
        ArrayList<Integer> myArray2 = new ArrayList<>();

        myArray1.add(5); myArray1.add(2); myArray1.add(3); myArray1.add(9); myArray1.add(4);
        myArray1.add(2); myArray1.add(7); myArray1.add(1); myArray1.add(7); myArray1.add(4);

        myArray2.add(1); myArray2.add(2); myArray2.add(2); myArray2.add(3); myArray2.add(4);
        myArray2.add(4); myArray2.add(5); myArray2.add(7); myArray2.add(7); myArray2.add(9);

        Bubblesort bubblesort = new Bubblesort();
        bubblesort.sort(myArray1);
        bubblesort.sort(myArray2);

        String testingArray1 = "" + myArray1.get(0);
        for(int i = 1; i < myArray1.size(); i++){
            testingArray1 +=  " " + myArray1.get(i);
        }
        String testingArray2 = "" + myArray2.get(0);
        for(int i = 1; i < myArray2.size(); i++){
            testingArray2 +=  " " + myArray2.get(i);
        }

        assertEquals(testingArray1, testingArray2);
    }
}
