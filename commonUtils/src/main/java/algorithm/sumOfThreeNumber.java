package algorithm;

import algorithm.sortUtils.BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
*<p>功能描述：求三个数的和</p>
*<ul> 说明：给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？
 * 请你找出所有满足条件且不重复的三元组。注意：答案中不可以包含重复的三元组。
*<li>@param </li>
*<li>@return </li>
*<li>@throws </li>
*<li>@author jackson</li>
*<li>@date 2020/8/24 9:34</li>
*</ul>
*/
public class sumOfThreeNumber {

    /**
    *<p>功能描述：sumOfThreeNumber 求三个数之和为0的数字集合</p>
    *<ul>
    *<li>@param [arr]</li>
    *<li>@return int[]</li>
    *<li>@throws </li>
    *<li>@author jackson</li>
    *<li>@date 2020/8/24 9:35</li>
    *</ul>
    */
    public static List<List<Integer>> sumOfThreeNumber(int[] arr){
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        /*先对数组进行排序*/
        BubbleSort.bubbleSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length - 3; i++) {
            int base = arr[i];
            int front = i + 1;
            int tail = arr.length - 1;
            if (arr[i] > 0) {
                break;
            }

            while(((base + arr[front] + arr[tail]) != 0) && front < tail){
                if ((base + arr[front] + arr[tail]) < 0) {
                    front++;
                }else if((base + arr[front] + arr[tail]) > 0) {
                    tail--;
                }
            }

            if ((base + arr[front] + arr[tail]) == 0 && front != tail) {
                result.add(Arrays.asList(base, arr[front], arr[tail]));
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {-1, 0, 7, 3, 96, -5};
        List<List<Integer>> result = sumOfThreeNumber(arr);
        System.out.println(result.toString());
    }
}
