/**
 * Created by wilin on 2018/5/31.
 */
public class _654_ConstructMaximumBinaryTree {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructBinaryTree(nums,0,nums.length - 1);
    }

    public TreeNode constructBinaryTree(int[] nums, int start, int end) {
        if(start > end){
            return null;
        }

        int mid = findMaxNum(nums,start, end);
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = constructBinaryTree(nums,start,mid - 1);
        treeNode.right = constructBinaryTree(nums,mid + 1,end);
        return treeNode;
    }

    private int findMaxNum(int[] nums, int start, int end){
        int index = start;
        int max = nums[start];
        for(int i = start + 1; i <= end; i++){
            if(max <= nums[i]){
                max = nums[i];
                index = i;
            }
        }

        return index;
    }
}
