package com.mine.test1;
import java.util.Scanner;
public class exceptionDemo2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的年龄：");
            String line = sc.nextLine();
            int age = Integer.parseInt(line);
            System.out.println(age);
            System.out.println(2 / 0);
        } catch (NumberFormatException e) {
            System.out.println("看看执行了没有？");

        }catch (ArithmeticException e){
            System.out.println("数学异常");
        }

        System.out.println("Test456");


    }
}
