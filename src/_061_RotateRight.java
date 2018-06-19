/**
 * Created by wilin on 2018/6/19.
 */
public class _061_RotateRight {

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
     * 输入: 1->2->3->4->5->NULL, k = 2
     * 输出: 4->5->1->2->3->NULL
     * 解释:
     * 向右旋转 1 步: 5->1->2->3->4->NULL
     * 向右旋转 2 步: 4->5->1->2->3->NULL
     */
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k <= 0){ // 空链表 或者移动步数小于1，不动
            return head;
        }

        // 链表长度
        int len = 0;
        ListNode it = head;
        while(it != null){
            it = it.next;
            len ++;
        }

        k = k % len;   // 计算需要移动步数
        if(k == 0){
            return head;
        }

        // 计算变换后的链尾
        ListNode pre = head;
        it = head;
        while(it.next != null && k > 0){
            it = it.next;
            k--;
        }

        while(it.next != null){
            pre = pre.next;
            it = it.next;
        }

        ListNode newHead = pre.next;
        it.next = head;
        pre.next = null;
        return newHead;
    }

//    public ListNode rotateRight(ListNode head, int k) {
//        if (head == null || k <= 0) {
//            return head;
//        }
//
//        ListNode current = head;
//        int n = 1;
//
//        // 先计算链表长度。
//        while (current.next != null) {
//            n++;
//            current = current.next;
//        }
//
//        current.next = head;
//
//        int count = n - k % n;
//        ListNode result;
//        for (int i = 0; i < count; i++) {
//            current = current.next;
//        }
//        result = current.next;
//        current.next = null;
//        return result;
//    }
}
