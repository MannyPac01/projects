package com.antonio;

public class Main {

    public static void main(String[] args) {

        // whole numbers
        // VVVVVVVVVVVVV
        // int has a width of 32
        int myMinValue=-2_147_483_648;
        int myMaxValue=2_147_483_647;

        // byte has a width of 8
        byte myByteValue = -128;

        // short has a width of 16
        short myShortValue = 32767;

        // long has a width of 64
        long myLongValue = 100L;

        int byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long eqVal = 50000 + 10 * (byteValue + shortValue + intValue);

        System.out.println(eqVal);
    }
}
