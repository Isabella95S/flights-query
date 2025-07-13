package com.develhope.flights_query.utils;

import java.util.Random;

public class RandomUtils {
    private static Random random = new Random();

    private static String alphabet = "ABCDEFGHILMNOPQKRSYXWTUVZ";
    public static String generaStringa(int length) {
        String s = "";
        for (int i = 0; i < length;i++) {
            char c = alphabet.charAt(random.nextInt(alphabet.length()));
            s = c + s;
        }
        return s;
    }
}
