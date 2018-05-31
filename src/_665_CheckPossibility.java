/**
 * Created by wilin on 2018/5/31.
 */
public class _665_CheckPossibility {

    /**
     * 修改一个数字后，仍出现递减，则失败；
     * 发现一个递减后，需要判断该数左右两边的大小，如果左边比右边大，则将左边的改成该数；如果右边比较大，则将该数改成左边的数字。
     */

    public boolean checkPossibility(int[] nums) {
        boolean decrease = false;
        for(int i = 1; i >= 0 && i < nums.length; ){

            if(i >= 1 && nums[i - 1] > nums[i]){
                if(decrease){
                    return false;
                }
                decrease = true;
                int left = (i == 0) ? Integer.MIN_VALUE : nums[i-1];
                int right = (i + 1 <= nums.length - 1) ?  nums[i+1] : Integer.MAX_VALUE ;

                if(left > right){
                    nums[i - 1] = nums[i];
                    i--;
                } else {
                    nums[i] = nums[i-1];
                    i++;
                }
            } else {
                i++;
            }

        }

        return true;
    }
}
