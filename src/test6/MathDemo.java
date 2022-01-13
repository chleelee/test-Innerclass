package test6;

import java.util.Map;
import java.util.function.DoubleToIntFunction;

public class MathDemo {
    public static void main(String[] args) {
        final int abs = Math.abs(-10);
        System.out.println(abs);
        final double ceil = Math.ceil(10.1);
        System.out.println(ceil);
        final double floor = Math.floor(10.1);
        System.out.println(floor);
        final long round = Math.round(10.1);
        System.out.println(round);
        final int max = Math.max(10, 20);
        System.out.println(max);
        for (int i = 0; i < 10; i++) {
            final double random = Math.random();
            System.out.println(random);
        }
        final double pow = Math.pow(3, 3);
        System.out.println(pow);



    }
}
