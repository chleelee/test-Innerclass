package test3;

public class MyIntergerDemo {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        final Integer i2 = Integer.valueOf(200);
        final Integer i3 = Integer.valueOf("300");
        System.out.println(i2 + i3);
        String s1 = "100";
        int i5 = 200;
        final int i4 = Integer.parseInt(s1);
        System.out.println(i4 + i5);
        final String s = String.valueOf(i5);



    }
}
