/**
 * Created by wilin on 2018/5/31.
 */
public class _101_IsSymmetric {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSymmetric(TreeNode root) {
        if(null == root){
            return true;
        }

        return isSymmetric(root.left,root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if(right != null && left != null){
            if(right.val != left.val){
                return false;
            }
            return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
        } else {
            return null == left && null == right;
        }
    }
}
