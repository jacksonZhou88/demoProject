package algorithm;
/**
*<p>功能描述：股票问题</p>
*<ul>
*<li>@param </li>
*<li>@return </li>
*<li>@throws </li>
*<li>@author jackson</li>
*<li>@date 2020/8/19 10:24</li>
*</ul>
*/
public class Stocks {

    /**
    *<p>功能描述：simpleStock 购买股票问题</p>
    *<ul> 数组代表第i天的价格
     * 1. 只允许一次买入一次卖出，不允许多次买入一次卖出，买入之前前面的必须都卖出
     * 思路：收益最大肯定是低价买入，高价卖出，可以用折线图分析一下，以【7,1,5,3,4,6,5】为例，第二天买入，
     * 第三天卖出赚4，第四天买入第6天卖出赚3，合计赚7，收益最大
    *<li>@param [arr]</li>
    *<li>@return int</li>
    *<li>@throws </li>
    *<li>@author jackson</li>
    *<li>@date 2020/8/19 10:25</li>
    *</ul>
    */
    public static int simpleStock(int[] prices){
        if (prices.length <=0 ) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < prices.length -1; i++) {
            if (prices[i] < prices[i+1]) {
                max += (prices[i+1] - prices[i]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,4,6,5};
        int val = simpleStock(arr);
        System.out.println(val);
    }


}
