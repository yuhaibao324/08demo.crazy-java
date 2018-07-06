package com.allenwhm.c6_basicClassLib.s2_systemRelated;

import java.io.IOException;

/**
 * @author allenwhm
 * @date 2018/7/6 14:22
 * @description
 */
public class RuntimeTest {

    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        System.out.println("processors: " + rt.availableProcessors());
        System.out.println("total memory: " + (rt.totalMemory()/Math.pow(1024,2)));
        System.out.println("max memory: " + (rt.maxMemory()/Math.pow(1024,2)));
        System.out.println("free memory: " + (rt.freeMemory()/Math.pow(1024,2)));

        System.out.println("---- execute cmd ----");
        rt.exec("notepad.exe");
    }
}
