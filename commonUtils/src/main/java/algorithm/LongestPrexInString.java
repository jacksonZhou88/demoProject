package algorithm;

/**
 * <p>功能描述：寻找最长公共前缀</p>
 * <ul> 说明：编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，则返回""
 * 输入： ["flowera","alowera","flightwera"]  输出： "fl"
 * 输入：["dog","racecar","car"]  输出: ""
 * 思路：最长前缀，找一个基准元素x1，比如flower， 其他元素x2,x3,x4，如果x2.index(x1) == 0
 * 说明就是最长前缀，如果是-1则从后往前一个元素一个元素减少然后匹配
 * <li>@param </li>
 * <li>@return </li>
 * <li>@throws </li>
 * <li>@author jackson</li>
 * <li>@date 2020/8/18 10:40</li>
 * </ul>
 */
public class LongestPrexInString {
    public static String getLongestPrex(String[] arr1) {
        if (arr1.length <= 0) {
            return null;
        }
        /*基准元素*/
        String val = arr1[0];
        for (String cell : arr1) {
            if (null == val || "" == val) {
                return "";
            }
            if (cell.length() <= 0) {
                return "";
            }
            while (cell.indexOf(val) == -1) {
                val = val.substring(0, val.length() - 1);
            }
        }
        return val;
    }

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        String value = getLongestPrex(arr);
        System.out.println(value);
    }
}
