/**
 * Created by wilin on 2018/5/31.
 */
public class _053_MaxSubArray {

    /**
     * 寻找最大的子序和，假设计算到第i个数A[i]，如果前i的最大和：Sum(i)比A[i]小，即前i-1和：Sum（i-1）小于0，那么舍弃之前的和，
     * 从A[i]开始开始计算。
     */

    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = sum;
        for(int i = 1;i < nums.length; i++){
            sum = findMax(sum + nums[i], nums[i]);
            max = findMax(sum, max);
        }
        return max;
    }

    private int findMax(int num1, int num2){
        if(num1 >= num2){
            return num1;
        } else {
            return num2;
        }
    }
}
