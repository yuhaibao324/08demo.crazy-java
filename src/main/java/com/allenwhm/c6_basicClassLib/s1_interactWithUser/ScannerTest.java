package com.allenwhm.c6_basicClassLib.s1_interactWithUser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author allenwhm
 * @date 2018/7/6 14:00
 * @description
 */
public class ScannerTest {

    public static void main(String[] args) throws FileNotFoundException {
        /*Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("please input : ");

        // hasNext() for String, nextInt nextLong etc
        while (sc.hasNext()) {
            System.out.println("input : " + sc.next());
            System.out.println("please input : ");
        }*/

        Scanner sc = new Scanner(new File(".gitignore"));
        System.out.println("the file <.gitignore> content : ");

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
