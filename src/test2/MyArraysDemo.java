package test2;

import java.util.Arrays;
import java.util.Date;

public class MyArraysDemo {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 6, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));;

        int[] arr1 = {3, 2, 4, 6, 7, 8, 10, 101};
        int index = Arrays.binarySearch(arr1, 10);
        System.out.println(index);
        int index1 = Arrays.binarySearch(arr1, 102);
        int index2 = Arrays.binarySearch(arr1, 11);
        System.out.println(index1);
        System.out.println(index2);
        Date d1 = new Date();
        System.out.println(d1);



    }
}
