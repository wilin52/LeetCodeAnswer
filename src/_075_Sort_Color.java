/**
 * Created by wilin on 2018/6/19.
 */
public class _075_Sort_Color {
    /**
     * 输入: [2,0,2,1,1,0]
     * 输出: [0,0,1,1,2,2]
     *
     * 本质上是排序算法。
     * 采用首尾双指针，如果左指针遇到0则left++; 如果是2，则将2放置右指针，right--。如果是1，则继续；
     */
    public void sortColors(int[] nums) {
        int small = 0, large = nums.length - 1;
        for (int i = 0; i <= large; ++i) {
            if (nums[i] == 0) {
                swap(nums,i,small++);
            } else if (nums[i] == 2) {
                swap(nums,i--,large--);
            }
        }
    }

    private void swap(int[] nums, int i ,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
