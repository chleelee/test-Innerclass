package com.mine.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo03 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        final String result1 = sdf.format(date);
        System.out.println(result1);

        String s = "2022-01-08";
        SimpleDateFormat ssddff = new SimpleDateFormat("yyyy-MM-dd");
        Date d = ssddff.parse(s);
        System.out.println(d);
    }
}
