package com.allenwhm.c6_basicClassLib.s3_frequentlyUsed;

import java.math.BigDecimal;

/**
 * @author allenwhm
 * @date 2018/7/6 17:20
 * @description
 */
public class BigDecimalTest {

    // BigDecimal used for calculation of double precisely
    // new BigDecimal("0.1") and BigDecimal.valueOf(0.05), not use new BigDecimal(0.1)

    public static void main(String[] args) {
        BigDecimal d1 = new BigDecimal("0.05");
        BigDecimal d2 = BigDecimal.valueOf(0.01);
        BigDecimal d3 = new BigDecimal(0.05);

        System.out.println("use String to create BigDecimal : ");
        System.out.println("0.05 + 0.01 : " + d1.add(d2));
        System.out.println("0.05 - 0.01 : " + d1.subtract(d2));
        System.out.println("0.05 * 0.01 : " + d1.multiply(d2));
        System.out.println("0.05 / 0.01 : " + d1.divide(d2));

        System.out.println("use double to create BigDecimal : ");
        System.out.println("0.05 + 0.01 : " + d3.add(d2));
        System.out.println("0.05 - 0.01 : " + d3.subtract(d2));
        System.out.println("0.05 * 0.01 : " + d3.multiply(d2));
        System.out.println("0.05 / 0.01 : " + d3.divide(d2));

        System.out.println("create a BigDecimal tooling class : ");
        System.out.println("0.5 / 0.1 : " + devide(0.5, 0.1));

    }

    public static double devide(double d1, double d2) {
        BigDecimal b1 = BigDecimal.valueOf(d1);
        BigDecimal b2 = BigDecimal.valueOf(d2);
        return b1.divide(b2, 10, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
