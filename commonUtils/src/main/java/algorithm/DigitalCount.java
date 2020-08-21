package algorithm;
/**
*<p>功能描述：加一</p>
*<ul> 说明： 给定一个由整数组成的非空数组所表示的非空整数，在改数的基础上加一
 * eg. 输入：[1,2,3]  --> 123 + 1 ---> 124  --> [1,2,4]
 * 输出[1，2，4]
*<li>@param </li>
*<li>@return </li>
*<li>@throws </li>
*<li>@author jackson</li>
*<li>@date 2020/8/21 9:29</li>
*</ul>
*/
public class DigitalCount {

    /**
    *<p>功能描述：digitalCount</p>
    *<ul> 解题思路：要模拟int值+1的情况，分为两种，一种是个位为9的需要考虑进位，一种是不为9的直接个位+1即可
    *<li>@param [arr]</li>
    *<li>@return int[]</li>
    *<li>@throws </li>
    *<li>@author jackson</li>
    *<li>@date 2020/8/21 9:32</li>
    *</ul>
    */
    public static int[] digitalCount(int[] arr){
        /*拿到末尾数字*/
        int val = arr[arr.length - 1];
        int jwcount = 0;
        if (val != 9) {

        }
        // for (int i = arr.length -1; i >= 0 ; i--) {
        //     int val = arr[i];
        //     if (val)
        // }
        // for(int val : arr){
        //
        // }
        return null;
    }

}
