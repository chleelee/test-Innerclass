package com.mine.test1;

import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);
        long date = 1000*60*60;
        Date d2 = new Date();
        System.out.println(d2);
        Date d3 = new Date(0L);
        System.out.println(d3);
    }
}
