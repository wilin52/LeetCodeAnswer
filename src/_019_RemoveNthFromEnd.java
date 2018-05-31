/**
 * Created by wilin on 2018/6/1.
 */
public class _019_RemoveNthFromEnd {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /*
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(n<=0||head==null){
        	return null;
        }
        ListNode p=head;
        ListNode q=head;
        ListNode m=head;
        for(int i=0;i<n-1;i++){
        	if(p.next!=null){
        		p=p.next;
        	}else{
        		return null;
        	}
        }
        while(p.next!=null){
        		p=p.next;
        		m=q;
        		q=q.next;
        }
        if(q==head){
        	head=head.next;
        }else{
        	m.next=q.next;
        }
        return head;
    }
     */

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode removeHead = head;
        ListNode remove = head;
        ListNode it = head;

        if(n == 0){
            return head.next;
        }
        int count = 0;
        while(it != null){

            if(count != n){
                count ++;
            } else {
                removeHead = remove;
                remove = remove.next;
            }
            it = it.next;

            if(it == null){
                removeHead.next = remove.next;
                if(head == remove){
                    ListNode h = remove.next;
                    head.next = null;
                    head = null;
                    remove = null;
                    return h;
                } else {
                    remove = null;
                }
            }

        }
        return head;
    }
}
