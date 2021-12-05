package com.sparta.controller;

import com.sparta.view.UserInput;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class SortManager {
    public static Logger logger = LogManager.getLogger("SortManager");

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        userInput.userInput();

        if (!userInput.getValid()) {
            logger.info("User input returned valid, running the Sortloop.");
            SortLoop sortLoop = new SortLoop();
            sortLoop.sortingLoop();
        }
        else{
            logger.info("User input returned invalid, exiting the program.");
        }
    }
}
