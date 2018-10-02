package com.allenwhm.c7_collection.s1_collectionType;

import java.util.*;

/**
 * @author allenwhm
 * @date 2018/7/7 22:15
 * @description
 */
public class ColletionType {

    public static void main(String[] args) {

        // the following is wrong, they are abstract method
        /*Collection c1 = new List();
        Collection c2 = new Set();
        Collection c3 = new Queue();*/

        List l1 = new ArrayList();
        List l2 = new LinkedList();
        List l3 = new Vector();
        l1.toArray();


    }
}
