package com.allenwhm.c6_basicClassLib.s3_frequentlyUsed;

import java.util.Objects;

/**
 * @author allenwhm
 * @date 2018/7/6 14:51
 * @description
 */
public class ObjectsTest {

    static ObjectsTest obj;

    public static void main(String[] args) {
        System.out.println("hasCode : " + Objects.hashCode(obj));
        System.out.println("toString :" + Objects.toString(obj));
        System.out.println("requireNotNull : " + Objects.requireNonNull(obj, "require not null, in exception message"));
    }
}
