package com.example.diwu.a2;

/**
 * Created by diwu on 18/2/10.
 */

public class Validator {
    public int validate(String p) {
        if (p.length() == 0) {
            return 0;
        }
        int Strength = 0;
        if (!p.equals("password")) {
            Strength++;
        }
        if (p.length() >= 8) {
            Strength++;
        } // length of 8
        if (!p.toLowerCase().equals(p)) {
            Strength++;
        }// lower and upper case
        if (p.matches("(.*)[0-9]+(.*)")) {
            Strength++;
        }//check number exist
        if (p.matches("(.*)[^0-9a-zA-Z]+(.*)")) {
            Strength++;
        }
        return Strength;
    }
}
