import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by wilin on 2018/5/31.
 */
public class _144_PreorderTraversal {

    /**
     * 利用栈的后入先出的特性，先访问根节点，然后将右子树放入栈中，再将左子树放入栈中。
     */

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(null == root){
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode it = stack.pop();
            if(it != null){

                if(it.right != null){
                    stack.add(it.right);
                }


                list.add(it.val);

                if(it.left != null){
                    stack.add(it.left);
                }

            }
        }



        return list;
    }
}
