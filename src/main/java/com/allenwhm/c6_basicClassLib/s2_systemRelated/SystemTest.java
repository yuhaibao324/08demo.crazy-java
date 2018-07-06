package com.allenwhm.c6_basicClassLib.s2_systemRelated;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * @author allenwhm
 * @date 2018/7/6 14:11
 * @description
 */
public class SystemTest {

    public static void main(String[] args) throws IOException {
        /*Map<String, String> env = System.getenv();
        for (String name : env.keySet()) {
            System.out.println(name + " : " + env.get(name));
        }

        System.out.println("-----------");
        System.out.println(System.getenv("JAVA_HOME"));

        Properties props = System.getProperties();
        props.store(new FileOutputStream("props.txt"), "System Properties");

        System.out.println("-----------");
        System.out.println(System.getProperty("os.name"));*/

        String s0 = "Hello";
        System.out.println(System.identityHashCode(s0));

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1.hashCode() + "----" + s2.hashCode());
        System.out.println(System.identityHashCode(s1) + "----" + System.identityHashCode(s2));

        String s3 = "Hello";
        String s4 = "Hello";
        System.out.println(System.identityHashCode(s3) + "----" + System.identityHashCode(s4));
    }
}
