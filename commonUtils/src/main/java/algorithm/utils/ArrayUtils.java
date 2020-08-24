package algorithm.utils;

public class ArrayUtils {

    /**
     * <p>功能描述：outputArr 打印数组</p>
     * <ul>
     * <li>@param [arr]</li>
     * <li>@return void</li>
     * <li>@throws </li>
     * <li>@author jackson</li>
     * <li>@date 2020/8/19 11:46</li>
     * </ul>
     */
    public static void outputArr(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].toString());
        }
    }

    public static void outputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void outputArrs(int[][] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            int[] vals = arr[i];
            System.out.print("[");
            for (int j = 0; j < vals.length; j++) {
                System.out.print(vals[j]+",");
            }
            System.out.print("],");
        }
        System.out.print("]");
    }

    /**
     * <p>功能描述：swap 交换位置</p>
     * <ul>
     * <li>@param [arr, i, j]</li>
     * <li>@return void</li>
     * <li>@throws </li>
     * <li>@author jackson</li>
     * <li>@date 2020/8/19 11:41</li>
     * </ul>
     */
    public static void swap(Object[] arr, Integer i, Integer j) {
        Object tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    /**
     * <p>功能描述：revert 将数组逆序</p>
     * <ul>
     * <li>@param [arr]</li>
     * <li>@return void</li>
     * <li>@throws </li>
     * <li>@author jackson</li>
     * <li>@date 2020/8/19 13:55</li>
     * </ul>
     */
    public static void revert(Integer[] arr, int start, int end) {
        for (int i = 1; i <= ((end - start + 1) / 2); i++) {
            swap(arr, start -1 + i, end - i + 1);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {9, 7, 5, 6, 4, 3, 2};
        revert(arr, 0, arr.length);
        outputArr(arr);
    }
}
