package com.sparta.view;

import com.sparta.controller.SortLoop;

import java.util.Scanner;

public class UserInput {
    public void userInput() {
        boolean invalid = true, calculations = false;
        String runningSort = "none", runningArray = "none";
        int arraySize = 10;
        Scanner scanner = new Scanner(System.in);
        while (invalid) {
            System.out.println("Which sorter do you want to use? \n 1 - Bubblesort \n 2 - Quicksort \n 3 - Both \n Q - Exit");
            runningSort = scanner.nextLine().toLowerCase();

            if (runningSort.equals("1")) runningSort = "bubblesort"; else if (runningSort.equals("2")) runningSort = "quicksort"; else if (runningSort.equals("3")) runningSort = "both";

            if (runningSort.equals("q")) {
                invalid = false;
                return;
            }
            else if (runningSort.equals("bubblesort") || runningSort.equals("quicksort") || runningSort.equals("both")){
                invalid = false;
            } else {
                System.out.println("No valid option picked, try again or exit by typing in Q.");
            }
        }
        invalid = true;

        while (invalid) {
            System.out.println("Which variant do you want to use? \n 1 - Array \n 2 - ArrayList \n 3 - Both \n Q - Exit");
            runningArray = scanner.nextLine().toLowerCase();

            if (runningArray.equals("q")) {
                invalid = false;
                return;
            }
            else if (runningArray.equals("array") || runningArray.equals("arraylist") || runningArray.equals("both")
                    || runningArray.equals("1") || runningArray.equals("2") || runningArray.equals("3")) {
                invalid = false;
            } else {
                System.out.println("No valid option picked, try again or exit by typing in Q.");
            }
        }
        invalid = true;

        while (invalid) {
            System.out.println("Do you want time calculations? \n 1 - Yes \n 2 - No \n Q - Exit");
            String runCalculations = scanner.nextLine().toLowerCase();

            if (runCalculations.equals("q")) {
                invalid = false;
                return;
            }
            else if (runCalculations.equals("yes") || runCalculations.equals("no") || runCalculations.equals("1") || runCalculations.equals("2")) {
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
                invalid = false;
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
}
