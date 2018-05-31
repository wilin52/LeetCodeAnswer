/**
 * Created by wilin on 2018/5/31.
 */
public class _121_MaxProfit {
    /**
     * 假设第j天买进
     * 假设第k天的利润为Pro(k)= Pri(k) - Pri(j),
     * 那么第i天的利润就为Pro(i)= Pri(i) - Pri(j) = Pri(i) - Pri(j) + Pro(k),
     * 那么可以就可以计算最大利润了。
     */

    public int maxProfit(int[] prices) {
        int profit = 0;
        int max = 0;
        for(int i = 1;i < prices.length;i++){
            profit = prices[i] - prices[i-1] + profit;
            if(profit > max){
                max = profit;
            } else if(profit < 0){
                profit = 0;
            }
        }
        return max;
    }
}
