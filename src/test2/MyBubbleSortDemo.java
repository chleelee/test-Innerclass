package test2;

public class MyBubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        //arr.length-1是为了使索引不超出范围
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                //做数据交换
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        printArr(arr);

        for (int i = 0; i < arr.length-1 -1; i++) {
            if (arr[i] > arr[i+1]) {
                //做数据交换
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        printArr(arr);

        for (int i = 0; i < arr.length-1 -2; i++) {
            if (arr[i] > arr[i+1]) {
                //做数据交换
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        printArr(arr);

        for (int i = 0; i < arr.length-1 -3; i++) {
            if (arr[i] > arr[i+1]) {
                //做数据交换
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        printArr(arr);



    }

    private static void printArr(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();//循环结束，换行
    }
}
