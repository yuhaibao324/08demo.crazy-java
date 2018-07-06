package com.allenwhm.c6_basicClassLib.s3_frequentlyUsed;

import java.util.Objects;

/**
 * @author allenwhm
 * @date 2018/7/6 14:44
 * @description
 */

class Address {
    String detail;

    public Address(String detail) {
        this.detail = detail;
    }
}

class User implements Cloneable {
    int age;
    Address address;

    public User(int age) {
        this.age = Objects.requireNonNull(age);
        address = new Address("Guangzhou");
    }

    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}

public class ObjectTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User(25);
        User u2 = u1.clone();

        System.out.println(u1 == u2);
        System.out.println(u1.address == u2.address);
    }
}
