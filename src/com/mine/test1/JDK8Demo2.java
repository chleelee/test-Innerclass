package com.mine.test1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class JDK8Demo2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime localDateTime = LocalDateTime.of(2022, 01, 8, 20, 00, 00);
        System.out.println(localDateTime);

        final Month month = localDateTime.getMonth();
        final int monthValue = localDateTime.getMonthValue();
        System.out.println(month);
        System.out.println(monthValue);
        final LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
        final LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        final String s = localDateTime.format(pattern);
        System.out.println(s);
        String str = "2000年10月25日 09:15:00";
        final DateTimeFormatter pattern1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        final LocalDateTime parse = localDateTime.parse(str, pattern1);
        System.out.println(parse);
        int dayOfYear = parse.getDayOfYear();
        System.out.println("这是2000年的第" + dayOfYear + "天");

    }
}
