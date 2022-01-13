package com.mine.test1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JDK8demo {
    public static void main(String[] args) {
        String s = "2020年10月25日 00:00:00";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(s, dateTimeFormatter);
        LocalDateTime newlocalDateTime = localDateTime.plusDays(1);
        String result = newlocalDateTime.format(dateTimeFormatter);
        System.out.println(result);
    }
}
