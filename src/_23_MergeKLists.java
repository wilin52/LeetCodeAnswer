/**
 * Created by wilin on 2018/5/31.
 */
public class _23_MergeKLists {
    /**
     * 利用两两合并，类似于归并排序
     */

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }

        if(lists.length == 1){
            return lists[0];
        }

        int length = lists.length;
        while(length > 1){
            int time = length / 2;
            int res = length % 2;


            for(int i = 0 ; i < time; i++){
                lists[i] = mergeTwoLists(lists[2 * i], lists[2 * i + 1]);
            }

            if(res == 0){
                length = time;
            } else {
                lists[time] = lists[length - 1];
                length = time + 1;
            }
        }
        return lists[0];
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }

        if(l2 == null){
            return l1;
        }

        ListNode header;
        if(l1.val < l2.val){
            header = l1;
            l1 = l1.next;
        } else {
            header = l2;
            l2 = l2.next;
        }

        ListNode it = header;
        while(l1 != null && l2 != null){
            ListNode next1 = l1;
            ListNode next2 = l2;
            if(next1.val < next2.val){
                it.next = next1;
                l1 = next1.next;
            } else {
                it.next =  next2;
                l2 = next2.next;
            }

            it = it.next;

        }

        if(l1 != null){
            it.next = l1;
        } else if(l2 != null){
            it.next = l2;
        }

        return header;

    }
}
