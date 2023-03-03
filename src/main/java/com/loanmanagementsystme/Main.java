package com.loanmanagementsystme;


import com.loanmanagementsystme.inputinformation.InputDetailsCheckers;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputDetailsCheckers inputDetailsCheckers =new InputDetailsCheckers();
        inputDetailsCheckers.checkDetails();
    }
}