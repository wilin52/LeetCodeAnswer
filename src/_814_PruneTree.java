/**
 * Created by wilin on 2018/6/1.
 */
public class _814_PruneTree {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /*
    public TreeNode pruneTree(TreeNode root) {
        if(root == null)    return null;

        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);

        if(root.left == null && root.right == null && root.val == 0)    root = null;

        return root;

    }
     */

    public TreeNode pruneTree(TreeNode root) {
        if(root == null){
            return root;
        }

        TreeNode leftNode = root.left;
        if(leftNode!= null  && leftNode.val == 0){
            if(!checkTreeNodeAvailable(leftNode)){
                root.left = null;
            }

        }

        TreeNode rightNode = root.right;
        if(null != rightNode && rightNode.val == 0){
            if(!checkTreeNodeAvailable(rightNode)){
                root.right = null;
            }
        }

        pruneTree(leftNode);
        pruneTree(rightNode);
        return root;
    }

    private boolean checkTreeNodeAvailable(TreeNode node){
        if(node == null){
            return false;
        } else{
            if(node.val == 1){
                return true;
            }

            boolean leftAvailable = false;
            TreeNode leftNode = node.left;
            if(leftNode != null){
                leftAvailable = checkTreeNodeAvailable(node.left);
            }

            boolean rightAvailable = false;
            TreeNode rightNode = node.right;
            if(rightNode != null){
                rightAvailable = checkTreeNodeAvailable(node.right);
            }

            return  leftAvailable|| rightAvailable;
        }
    }
}
