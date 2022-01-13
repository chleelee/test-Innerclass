package com.mine.test1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JDK8Demo3 {
    public static void main(String[] args) {
        CharSequence text;
        DateTimeFormatter formatter;
        LocalDateTime localDateTime = LocalDateTime.of(2020, 10, 25, 9,15,00);
        LocalDateTime newLocalDateTime = localDateTime.plusYears(2);
        LocalDateTime localDateTime1 = newLocalDateTime.minusWeeks(2);
        LocalDateTime localDateTime2 = localDateTime1.withMonth(9);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String newDate = localDateTime2.format(pattern);
        System.out.println(newDate);


    }
}
