package com.example.linh.funfacts;

import java.util.Random;

/**
 * Created by linh on 4/22/2016.
 */
public class randcomColor {
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public String getColor()
    {
        Random randomGen = new Random();
        int randomNumber = randomGen.nextInt(mColors.length);
        return mColors[randomNumber];
    }
}
