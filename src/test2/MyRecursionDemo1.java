package test2;

public class MyRecursionDemo1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);


        int sum1 = getSum(100);
        System.out.println(sum1);
    }
    private static int getSum(final int j) {
        if (j == 1) {
            return 1;
        }else
            return j + getSum(j - 1);
    }
}
