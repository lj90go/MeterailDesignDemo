package com.mddemo.jieluo.meteraildesigndemo;

/**
 * Created by edutech on 16/7/14.
 */
public class Meterial {
    private static Meterial ourInstance = new Meterial();

    public static Meterial getInstance() {
        return ourInstance;
    }

    private Meterial() {
    }
}
