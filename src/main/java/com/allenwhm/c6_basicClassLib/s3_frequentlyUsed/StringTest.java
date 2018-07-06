package com.allenwhm.c6_basicClassLib.s3_frequentlyUsed;

import java.nio.charset.Charset;

/**
 * @author allenwhm
 * @date 2018/7/6 14:54
 * @description
 */
public class StringTest {

    // String, StringBuffer (thread safe), StringBuilder(better performance)

    // lots of methods, refer to java doc

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("java");
        System.out.println(sb);

        sb.insert(0, "hello ");
        System.out.println(sb);

        sb.replace(5, 6, ",");
        System.out.println(sb);

        sb.delete(5, 6);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.setLength(5);
        System.out.println(sb);

    }
}
