/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode even = head.next;;
        ListNode odd = head;
        ListNode evenHead = even;

        while(even!=null&&even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;

        return head;
    }
}


        //wrong approach
        // ListNode newHead  = new ListNode(0);
        // ListNode l1 = newHead;

        // ListNode odd = head;
        // ListNode even = head.next;

        // while(odd!=null){
        //     l1.next = odd.next;
        //     odd = odd.next;
        //     l1 = l1.next;
        //     odd = (odd.next != null) ? odd.next.next : null; 
        // }

        // while(even!=null){
        //     l1.next = even.next;
        //     even = even.next;
        //     l1 = l1.next;
        //     even = (even.next != null) ? even.next.next : null; 
        // }
        // l1.next = null;
        // return newHead.next;