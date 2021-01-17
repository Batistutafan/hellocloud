package com.cntv.ribbonconsumer.web;

import java.sql.Timestamp;

public class Test {
    public static String msg = "aaaa";
    public static void main(String[] args) {
        Timestamp a = Timestamp.valueOf("2018-05-18 09:32:32");
        Timestamp b = Timestamp.valueOf("2018-05-11 09:32:32");
        System.out.println(a.compareTo(b));
    }
}