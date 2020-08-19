package algorithm;

import java.util.*;

/**
 * <p>功能描述：求数组交集</p>
 * <ul>
 * <li>@param </li>
 * <li>@return </li>
 * <li>@throws </li>
 * <li>@author jackson</li>
 * <li>@date 2020/8/17 10:39</li>
 * </ul>
 */
public class ArrMixed {

    /**
     * <p>功能描述：getArrMixed 求两个数组的交集, 无序</p>
     * <ul> 思路：
     * 1.如果没有顺序求交集就应该想到是典型的映射型题目，以数字为键，数字出现的次数为值
     * 2.先统计第一个数组，放在map中，再遍历第二个数组中的每一个元素匹配map中出现的次数，
     * 出现一个map中的count--,然后记录出现的元素
     * <li>@param [arr1, arr2]</li>
     * <li>@return int[]</li>
     * <li>@throws </li>
     * <li>@author jackson</li>
     * <li>@date 2020/8/17 10:41</li>
     * </ul>
     */
    public static List<Integer> getArrMixedNoOrder(int[] arr1, int[] arr2) {
        Map<Integer, Integer> result = new HashMap();
        for (int i = 0; i < arr1.length; i++) {
            Integer val = arr1[i];
            if (null == result.get(arr1[i])) {
                result.put(arr1[i], 1);
            } else {
                Integer count = result.get(arr1[i]);
                result.put(val, ++count);
            }
        }

        int k = 0;
        List<Integer> valList = new ArrayList<Integer>();
        for (int j = 0; j < arr2.length; j++) {
            int cellVal = arr2[j];
            if (result.get(cellVal) > 0) {
                valList.add(cellVal);
                int count = result.get(cellVal);
                result.put(cellVal, --count);
            }
        }
        return valList;
    }


    /**
     * <p>功能描述：getArrMixedWithOrder 两个数组都是有序的</p>
     * <ul> 思路：用两个指针指向两个数组的第一个元素，然后比较，出现相同元素，记录，然后两个指针同时往后移动
     * <li>@param [arr1, arr2]</li>
     * <li>@return java.util.List<java.lang.Integer></li>
     * <li>@throws </li>
     * <li>@author jackson</li>
     * <li>@date 2020/8/17 11:02</li>
     * </ul>
     */
    public static List<Integer> getArrMixedWithOrder(int[] arr1, int[] arr2) {
        int i=0, j=0;
        List<Integer> result = new ArrayList();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            }else if (arr1[i] > arr2[j]){
                j++;
            }else{
                result.add(arr2[j]);
                i++;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 3, 3, 4, 7, 9};
        int[] a2 = {2, 3, 7};
        List<Integer> val = getArrMixedWithOrder(a1, a2);
        System.out.println(val.toString());
    }
}
