package com.philcostache;

public class Main {

    public static void main(String[] args) {

        // Integer (most common)
        //==================================================================
        // int has a width of 32
        // smallest number that can fit into an integer
        // can use underscores to make the number more readable
        int myMinValue = -2_147_483_648;
        // maximum integer value
        int myMaxValue = 2_147_483_647;

        // Byte
        //==================================================================
        // byte data types requires less memory space than an integer
        // byte has a width of 8

        // min byte
        byte myMinByte = -128;
        // max byte
        byte myMaxByte = 127;
                            // casting (byte)
        byte myNewByteValue = (byte) (myMinByte / 2); // not adding byte throws an error

        System.out.println("myNewByteValue = " + myNewByteValue);

        // Short
        //===================================================================
        // shorts allocate twice the memory of bytes, half the integer amount
        // short has a width of 16

        // min short
        short myShortMin = -32768;
        // max short
        short myShortMax = 32767;
                              // casting (short)
        short myNewShortValue = (short) (myShortMax / 2); // not adding short throws an error
        System.out.println("myNewShortValue = " + myNewShortValue);

        // Long
        //===================================================================
        // long has a width of 64

        // min long
        long myMinLong = -9_223_372_036_854_775_808L; // need to add an L/l to the end of the long value
        // max long
        long myMaxLong = 9_223_372_036_854_775_807L;
    }
}
