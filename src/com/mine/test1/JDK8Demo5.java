package com.mine.test1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class JDK8Demo5 {
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.of(2019, 10, 25, 11,32, 45);
        LocalDateTime date2 = LocalDateTime.of(2050, 1, 25, 1, 7, 19);
        Duration duration = Duration.between(date1, date2);
        System.out.println(duration);
        System.out.println(duration.toMillis());
        System.out.println(duration.toMinutes());
        LocalDate localDate1 = date1.toLocalDate();
        LocalDate localDate2 = date2.toLocalDate();
        Period period = Period.between(localDate1, localDate2);
        System.out.println(period);
        System.out.println(period.toTotalMonths());
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
    }
}
