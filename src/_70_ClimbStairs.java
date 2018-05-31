/**
 * Created by wilin on 2018/5/31.
 */
public class _70_ClimbStairs {
    /**
     * 假设S(n) 为n个台阶共有的方案：
     * 若最后一步走1个台阶，那么，总的方案有S(n-1)
     * 若最后一步走2个台阶，那么，总的方案有S(n-2)
     * 所以有S(n) = S(n-1) + S(n-2)
     */

    // s(n) = s(n-1) + s(n-2)
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }

        int pre = 1, post = 2;
        for(int i = 3; i <= n; i++){
            int tmp = post;
            post += pre;
            pre = tmp;
        }

        return post;
    }

}
