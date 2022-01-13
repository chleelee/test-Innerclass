package test4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class MyObjectsDemo {
    public static void main(String[] args) {
        Student s = new Student("小路",50);
        final String result = Objects.toString(s);
        System.out.println(result);
        Student student = null;
        final String s1 = Objects.toString(student, "随便写一个");
        System.out.println(s1);
        Student stu = null;
        final boolean b = Objects.isNull(stu);
        System.out.println(b);
        final boolean c = Objects.nonNull(stu);
        System.out.println(c);
        BigDecimal bd1 = new BigDecimal("0.3");
        BigDecimal bd2 = new BigDecimal("0.5");
        final BigDecimal add = bd1.add(bd2);
        System.out.println(add);
        final BigDecimal subtract = bd1.subtract(bd2);
        System.out.println(subtract);
        final BigDecimal multiply = bd1.multiply(bd2);
        System.out.println(multiply);
        final BigDecimal divide = bd1.divide(bd2);
        System.out.println(divide);
        BigDecimal bd3 = new BigDecimal("10.0");
        BigDecimal bd4 = new BigDecimal("3.0");
        final BigDecimal divide1 = bd3.divide(bd4, 2, RoundingMode.UP);
        System.out.println(divide1);
        final BigDecimal divide2 = bd3.divide(bd4, 2, RoundingMode.FLOOR);
        System.out.println(divide2);
        final BigDecimal divide3 = bd3.divide(bd4, 2, RoundingMode.HALF_UP);
        System.out.println(divide3);
        final BigDecimal divide4 = bd3.divide(bd4, 10, RoundingMode.DOWN);
        System.out.println(divide4);

    }
}
