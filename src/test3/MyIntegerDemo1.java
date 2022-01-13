package test3;

import java.lang.reflect.Array;
import java.util.Arrays;
public class MyIntegerDemo1 {
    public static void main(String[] args) {
        String s = "191 87 65 85 47";
        String[] strArr = s.split(" ");
        int [] numberArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
            int number = Integer.parseInt(strArr[i]);
            numberArr[i] = number;
        }
        Arrays.sort(numberArr);
        for (int j = 0; j < numberArr.length; j++) {
            System.out.println(numberArr[j]);
        }
    }
}
