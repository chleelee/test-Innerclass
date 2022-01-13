package test2;

public class MyBubbleSortDemo2 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4, 10, 4};
        bubbleSort(arr);
    }

    private static void bubbleSort(final int[] arr) {
        //arr.length-1是为了使索引不超出范围
        //外层循环控制的是次数，这比数组的长度-1
        for (int i = 0; i < arr.length -1; i++) {
            //内层循环是实际去比较的
            //-1，是为了数组不越界
            //-i，每一轮结束之后，就会少一个数字
            for (int j = 0; j < arr.length -1 -i; j++) {
                if (arr[j] > arr[j+1]) {
                    //做数据交换
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
