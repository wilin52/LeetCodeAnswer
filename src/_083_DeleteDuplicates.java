/**
 * Created by wilin on 2018/5/31.
 */
public class _083_DeleteDuplicates {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode deleteDuplicates(ListNode head) {
        if(null == head){
            return head;
        }

        ListNode it = head;
        ListNode next = it.next;
        while(next != null){
            if(it.val == next.val){
                it.next = next.next;
            } else {
                it = next;
            }
            next = it.next;
        }
        return head;
    }
}
