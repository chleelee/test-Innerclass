package test2;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class MyRecursionDemo2 {
    public static void main(String[] args) {
        int num = getnum(5);
        System.out.println("5!是：" + num);
    }

    private static int getnum(final int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * (getnum(i - 1));
        }

    }
}
