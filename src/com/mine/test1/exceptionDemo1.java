package com.mine.test1;

public class exceptionDemo1 {
    public static void main(String[] args) {
        int [] arr = null;
        try{
        printArr(arr);
    }catch(NullPointerException e){//异常的名字为NullPointerException，变量名起名为e
            System.out.println("参数不能为null");
        }
    }

    private static void printArr(int[] arr) {
        if (arr == null) {
            throw new NullPointerException();
        }else{
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
