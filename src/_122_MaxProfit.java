/**
 * Created by wilin on 2018/5/31.
 */
public class _122_MaxProfit {

    /**
     * 这是53题的变种，如果某一天卖出去亏钱了，就说明它不是这段时间的最低价格，那么就不应该在当时买进。
     * 如果有利润，就买卖。
     * 因为：假设 j->i为最大利润，那么j->k + k->i 也为最大利润，相当于中间没有买卖，所以这题可以用贪心来解决。
     */
    public int maxProfit(int[] prices) {
        int[] profit = new int[prices.length];
        int max = 0;
        for(int i = 0; i < prices.length - 1; i++){
            for(int j = i+1;j < prices.length;j ++){
                if(prices[i] >= prices[j]){
                    profit[j] = profit[j-1];
                } else {
                    profit[j] = Math.max(profit[i] + prices[j] - prices[i],profit[j -1]);
                }
                max = Math.max(max,profit[j]);
            }
        }
        return max;
    }
}
