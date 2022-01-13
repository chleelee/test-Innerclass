package com.mine.test1;

import java.util.Date;

public class DateDemo02 {
    public static void main(String[] args) {
        method1();
        Date d2 = new Date();
        d2.setTime(0L);
        System.out.println(d2);
    }

    private static void method1() {
        Date d1 = new Date();
        final long time = d1.getTime();
        System.out.println(time);
        final long l = System.currentTimeMillis();
        System.out.println(l);
    }
}
