/**
 * Created by wilin on 2018/5/31.
 */
public class _100_IsSameTree {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(null == p && null == q){
            return true;
        }

        if(null == p || null == q || p.val != q.val){
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
    }
}
