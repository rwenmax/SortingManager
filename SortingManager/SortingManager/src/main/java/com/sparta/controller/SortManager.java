package com.sparta.controller;

import com.sparta.view.UserInput;

public class SortManager {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        userInput.userInput();

        SortLoop sortLoop = new SortLoop();
        sortLoop.sortingLoop();
    }
}
