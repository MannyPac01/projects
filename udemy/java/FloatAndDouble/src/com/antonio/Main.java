package com.antonio;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
	    int myIntValue = 5 / 3;
	    // width of float = 32 (4 bytes)
	    float myFloatValue = 5f / 3f;
	    //width of double = 64 (8 bytes)
	    double myDoubleValue = 5d / 3d;

        System.out.println("my Int Value = " + myIntValue);
        System.out.println("my Float Value = " + myFloatValue);
        System.out.println("my Double Value = " + myDoubleValue);

        double pounds = 200d;
        double kilograms = pounds * 0.45359237d;

        System.out.println(pounds + " pounds converted to kilograms = " + kilograms);

        double pi = 3.141_592_7d;
        System.out.println(pi);
    }
}
