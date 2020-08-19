package algorithm;

import algorithm.utils.ArrayUtils;

/**
 * <p>功能描述：旋转数组</p>
 * <ul> 说明：将一个数组向右移动k个单位
 * eg. [3,7,4,2,5,9,8,6] 向右移动3个单位--> [9,8,6,3,7,4,2,5]
 * <li>@param </li>
 * <li>@return </li>
 * <li>@throws </li>
 * <li>@author jackson</li>
 * <li>@date 2020/8/19 11:28</li>
 * </ul>
 */
public class ArrCirculate {

    /**
     * <p>功能描述：arrRevolve1 </p>
     * [3,7,4,2,5,9,8,6] 向右移动3个单位
     * <ul> 解法1：把数组分成两段，一段是向右移动的，一段是翻转到数组头上的
     * <li>@param [arr]</li>
     * <li>@return int[]</li>
     * <li>@throws </li>
     * <li>@author jackson</li>
     * <li>@date 2020/8/19 11:36</li>
     * </ul>
     */
    public static Integer[] arrRevolve1(Integer[] arr, int k) {
        /*记录需要翻转的部分*/
        int[] arrRight = new int[k];
        for (int i = 0; i < k; i++) {
            arrRight[i] = arr[arr.length - k + i];
        }
        /*将平移部分向右移动3个单位*/
        for (int i = arr.length - 1 - k, j = 0; i >= 0; i--, j++) {
            arr[arr.length - 1 - j] = arr[i];
        }
        /*将翻转的部分接到头上*/
        for (Integer i = 0; i < k; i++) {
            arr[i] = arrRight[i];
        }
        return arr;
    }


    /**
    *<p>功能描述：arrRevolve2 翻转数组</p>
    *<ul> 解法2：将数组先逆序，然后以k为界限两边再逆序就可以了
    *<li>@param [arr, k]</li>
    *<li>@return java.lang.Integer[]</li>
    *<li>@throws </li>
    *<li>@author jackson</li>
    *<li>@date 2020/8/19 13:51</li>
    *</ul>
    */
    public static void arrRevolve2(Integer arr[], int k) {
        ArrayUtils.revert(arr, 0, arr.length - 1);
        ArrayUtils.revert(arr, 0, k - 1);
        ArrayUtils.revert(arr, k, arr.length - 1);
    }



    public static void main(String[] args) {
        Integer[] arr = {3, 7, 4, 2, 5, 9, 8};
        arrRevolve2(arr, 3);
        ArrayUtils.outputArr(arr);
    }


}
