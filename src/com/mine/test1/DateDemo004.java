package com.mine.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateDemo004 {
    public static void main(String[] args) throws ParseException {
        String start = "2020年11月11日 0:0:0";
        String end = "2020年11月11日 0:10:0";
        String jia = "2020年11月11日 0:03:47";
        String pi = "2020年11月11日 0:10:11";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long startTime = sdf.parse(start).getTime();
        System.out.println(startTime);
        long endTime = sdf.parse(end).getTime();
        System.out.println(endTime);
        long jiaTime = sdf.parse(jia).getTime();
        long piTime = sdf.parse(pi).getTime();
        if (jiaTime > startTime && jiaTime < endTime){
            System.out.println("小贾赢得了秒杀时间");
        }else {
            System.out.println("抱歉，小贾超过了有效时间");
        }

        if(piTime > startTime && piTime < endTime){
            System.out.println("小皮赢得了秒杀时间");
        }else{
            System.out.println("抱歉，小皮超过了有效时间");
        }
    }
}
