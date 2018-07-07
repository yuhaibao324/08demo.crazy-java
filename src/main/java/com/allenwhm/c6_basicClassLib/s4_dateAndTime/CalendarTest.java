package com.allenwhm.c6_basicClassLib.s4_dateAndTime;

import java.util.Calendar;

/**
 * @author allenwhm
 * @date 2018/7/6 17:46
 * @description
 */
public class CalendarTest {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));

        c.set(2018, 7, 7, 22, 05, 30);
        System.out.println(c.getTime());

        // difference of roll() and add() : when number flow, for roll() will not change in the HIGHER level
        System.out.println("------roll and add--------");

        c.add(Calendar.YEAR, -1);
        System.out.println(c.getTime());

        c.roll(Calendar.MONTH, -5);
        System.out.println(c.getTime());

        // whether set false tolerant
        System.out.println("-------false tolerant------");

        c.set(Calendar.MONTH, 13);

//        c.setLenient(false);

        c.set(Calendar.MONTH, 13);

        System.out.println(c.getTime());

        // set(), lazy change
        System.out.println("----------set is lazy----------");

        c.set(2018, 7, 31);
        c.set(Calendar.MONTH, 8);
        System.out.println(c.getTime());

        c.set(Calendar.DATE, 6);
        System.out.println(c.getTime());



    }

}
