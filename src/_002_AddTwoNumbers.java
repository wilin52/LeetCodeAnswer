/**
 * Created by wilin on 2018/5/31.
 */
public class _002_AddTwoNumbers {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode iteratorNode1 = l1.next;
        ListNode iteratorNode2 = l2.next;

        int sum = l1.val + l2.val;
        int lowNum = sum;
        int highNum = 0;
        boolean moreThanTen = lowNum >= 10;
        if(moreThanTen){
            highNum = 1;
            lowNum %= 10;
        }
        ListNode l3 = new ListNode(lowNum);
        ListNode iteratorNode3 = null;
        if(moreThanTen){
            l3.next = new ListNode(highNum);
        }
        iteratorNode3 = l3;

        while(iteratorNode1 != null || iteratorNode2 != null){
            int firstValue =  iteratorNode1 == null ? 0 : iteratorNode1.val;
            int secondValue =  iteratorNode2 == null ? 0 : iteratorNode2.val;
            int nextValue = iteratorNode3.next == null ? 0 : iteratorNode3.next.val;
            sum = firstValue + secondValue + nextValue;
            lowNum = sum;
            highNum = 10;
            moreThanTen = lowNum >= 10;
            if(moreThanTen){
                highNum = 1;
                lowNum %= 10;
            }

            iteratorNode3.next = new ListNode(lowNum);
            ListNode next = null;
            if(moreThanTen ){
                next = new ListNode(highNum);
            }
            iteratorNode3.next.next = next;
            iteratorNode3 = iteratorNode3.next;
            if(iteratorNode1 !=  null) {
                iteratorNode1 = iteratorNode1.next;
            }

            if(iteratorNode2 != null){
                iteratorNode2 = iteratorNode2.next;
            }
        }

        return l3;
    }
}
