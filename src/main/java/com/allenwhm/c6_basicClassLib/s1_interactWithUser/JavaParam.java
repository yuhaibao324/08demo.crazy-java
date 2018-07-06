package com.allenwhm.c6_basicClassLib.s1_interactWithUser;

import java.util.Arrays;

/**
 * @author allenwhm
 * @date 2018/7/6 13:56
 * @description
 */
public class JavaParam {

    public static void main(String[] args) {
        System.out.println(args.length);

//        for (String arg : args) {
//            System.out.println(arg);
//        }

//        Arrays.asList(args).stream().forEach(System.out::println);
        Arrays.asList(args).forEach(System.out::println);
    }
}
