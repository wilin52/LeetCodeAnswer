import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by wilin on 2018/5/31.
 */
public class _094_InorderTraversal {

    /**
     * 利用栈的后入先出的特性，将根节点放入栈中，访问左子树，然后在访问右子树。
     */
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(null == root){
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();

        TreeNode it = root;
        while(it != null || !stack.isEmpty()){
            while(it != null){
                stack.add(it);
                it = it.left;
            }

            if(!stack.isEmpty()){
                it = stack.pop();
                list.add(it.val);
                it = it.right;
            }
        }
        return list;
    }
}
