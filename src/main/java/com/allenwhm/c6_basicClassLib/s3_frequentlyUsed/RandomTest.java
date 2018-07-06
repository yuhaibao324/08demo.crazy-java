package com.allenwhm.c6_basicClassLib.s3_frequentlyUsed;

import javafx.scene.control.RadioMenuItem;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author allenwhm
 * @date 2018/7/6 15:16
 * @description
 */
public class RandomTest {

    // Random / ThreadLocalRandom

    public static void main(String[] args) {

       /* Random random = new Random();
        System.out.println("random.nextBoolean() : " + random.nextBoolean());

        byte[] buffer = new byte[16];
        random.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));

        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());
        System.out.println(random.nextInt());
        System.out.println(random.nextLong());
        System.out.println(random.nextInt(26)); // if set seed, then 0 ~ seed*/

        // if seed is same, different random object will generate same value => not really random

        Random r1 = new Random();
        Random r2 = new Random(System.currentTimeMillis());
        // the two methods are same

        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        int val1 = tlr.nextInt(4, 20);
        double val2 = tlr.nextDouble(2.0, 5.0);
        System.out.println(val1 + " - " + val2);
    }
}
