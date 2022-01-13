package com.mine.test1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class JDK8Demo4 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2019, 10, 25);
        LocalDate date2 = LocalDate.of(2050, 1, 25);
        Period period = Period.between(date1, date2);
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
        System.out.println(period.toTotalMonths());


    }
}
