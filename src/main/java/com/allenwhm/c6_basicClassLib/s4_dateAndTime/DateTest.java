package com.allenwhm.c6_basicClassLib.s4_dateAndTime;

import java.util.Date;

/**
 * @author allenwhm
 * @date 2018/7/6 17:43
 * @description
 */
public class DateTest {

    // out of date, reduce usage

    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(System.currentTimeMillis() + 100);

        System.out.println(d2);
        System.out.println(d1.before(d2));
        System.out.println(d1.compareTo(d2));
    }

}
