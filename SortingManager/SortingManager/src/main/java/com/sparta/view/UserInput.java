package com.sparta.view;

import com.sparta.controller.SortLoop;

import java.util.Scanner;

public class UserInput {
    boolean invalid = true;
    public void userInput() {
        boolean calculations = false;
        String runningSort = "none", runningArray = "none";
        int arraySize = 10;
        Scanner scanner = new Scanner(System.in);
        while (invalid) {
            System.out.println("Which sorter do you want to use? \n 1 - Bubblesort \n 2 - Quicksort \n 3 - Treesort \n 4 - All \n Q - Exit");
            runningSort = scanner.nextLine().toLowerCase();

            if (runningSort.equals("1")) runningSort = "bubblesort";
            else if (runningSort.equals("2")) runningSort = "quicksort";
            else if (runningSort.equals("3")) runningSort = "treesort";
            else if (runningSort.equals("4")) runningSort = "all";

            if (runningSort.equals("q")) {
                return;
            } else if (runningSort.equals("bubblesort") || runningSort.equals("quicksort") || runningSort.equals("all") || runningSort.equals("treesort")) {
                invalid = false;
            } else {
                System.out.println("No valid option picked, try again or exit by typing in Q.");
            }
        }
        invalid = true;

        while (invalid) {
            System.out.println("Which variant do you want to use? \n 1 - Array \n 2 - ArrayList \n 3 - Both \n Q - Exit");
            runningArray = scanner.nextLine().toLowerCase();

            if (runningArray.equals("1")) runningArray = "array";
            else if (runningArray.equals("2")) runningArray = "arraylist";
            else if (runningArray.equals("3")) runningArray = "both";

            if (runningArray.equals("q")) {
                return;
            } else if (runningArray.equals("array") || runningArray.equals("arraylist") || runningArray.equals("both")) {
                invalid = false;
            } else {
                System.out.println("No valid option picked, try again or exit by typing in Q.");
            }
        }
        invalid = true;

        while (invalid) {
            System.out.println("Do you want time calculations? \n 1 - Yes \n 2 - No \n Q - Exit");
            String runCalculations = scanner.nextLine().toLowerCase();

            if (runCalculations.equals("1")) runCalculations = "yes";
            else if (runCalculations.equals("2")) runCalculations = "no";

            if (runCalculations.equals("q")) {
                return;
            } else if (runCalculations.equals("yes") || runCalculations.equals("no")) {
                invalid = false;
            } else {
                System.out.println("No valid option was picked, try again or exit by typing in Q");
            }
        }
        invalid = true;

        while (invalid) {
            System.out.println("Array size in integers? Q - Exit");
            String arraySizeString = scanner.nextLine().toLowerCase();

            if (arraySizeString.equals("q")) {
                return;
            }
            try {
                arraySize = Integer.parseInt(arraySizeString);
                invalid = false;
            } catch (NumberFormatException e) {
                System.err.println("Input is an invalid integer, try again or exit by typing in Q");
            }
        }
        SortLoop.setVariables(calculations, runningSort, runningArray, arraySize);
    }
    public boolean getValid(){
        return invalid;
    }
}
