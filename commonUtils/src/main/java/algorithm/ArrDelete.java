package algorithm;

/**
 * <p>功能描述：删除数组问题</p>
 * <ul>
 * <li>@param </li>
 * <li>@return </li>
 * <li>@throws </li>
 * <li>@author jackson</li>
 * <li>@date 2020/8/20 9:24</li>
 * </ul>
 */
public class ArrDelete {

    /**
     * <p>功能描述：arrDeleteWithNoAllocation 给定一个数组，和一个值，数组中如果出现指定元素，原地删除，不能新创建数组空间</p>
     * <ul> 思路：原地删除指的是在原数组中修改，不新创建数组
     * <li>@param [arr]</li>
     * <li>@return int</li>
     * <li>@throws </li>
     * <li>@author jackson</li>
     * <li>@date 2020/8/20 9:29</li>
     * </ul>
     */
    public static int arrDeleteWithNoAllocation(int[] arr, int value) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != value) {
                arr[i++] = arr[j];
            }
        }
        return i;
    }


    /**
    *<p>功能描述：orderArrDeleteRepeatedMember 删除数组中重复的元素</p>
    *<ul>
    *<li>@param [arr]</li>
    *<li>@return int</li>
    *<li>@throws </li>
    *<li>@author jackson</li>
    *<li>@date 2020/8/20 9:40</li>
    *</ul>
    */
    public static int orderArrDeleteRepeatedMember(int[] arr) {
        int j = 1;
        for (int i = 1; i <arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                arr[j++] = arr[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,4,5,6};
        int value = orderArrDeleteRepeatedMember(arr);
        for (int i = 0; i < value; i++) {
            System.out.print(arr[i]);
        }
    }
}
