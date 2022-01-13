package test2;

public class MyQuiteSortDemo2 {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quiteSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void quiteSort(int[] arr, int left, int right) {
        //设置递归的停止条件
        if (left > right){
            return;
        }
        int left0 = left;
        int right0 = right;
        //默认基础数
        int baseNumber = arr[left0];

        while(left != right){
            while (arr[right] >= baseNumber && right > left) {
                right--;
            }
            while(arr[left] <= baseNumber && right > left){
                left++;
            }
            //交换两个值的位置
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        //基准数归位
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;

        quiteSort(arr, left0, left - 1);
        quiteSort(arr,left + 1, right0);
    }

}
