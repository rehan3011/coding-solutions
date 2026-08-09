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
    public ListNode swapPairs(ListNode head) {
         if(head==null||head.next==null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;

        while(temp.next!=null&&temp.next.next!=null){
            ListNode f = temp.next;
            ListNode s = temp.next.next;

            f.next = s.next;
            s.next = f;
            temp.next = s;

            temp = f;
        }
        return dummy.next;


        //Wrong Approach
        // ListNode l = new ListNode(0);
        // ListNode temp = l;

        // ListNode f =head;
        // ListNode s =head.next;

        // while(s!=null&&s.next!=null){
        //     temp.next = s;
        //     temp.next = f;
        //     temp = temp.next;
        //     s = s.next.next;
        //     f = f.next.next;
        // }

        // return l.next;

        //Wrong Approach
        // ListNode curr = head;
        // ListNode dummy = new ListNode(0);
        // ListNode temp = dummy;

       
        // while(curr!=null&&curr.next!=null){
        //     int emp = curr.val;
        //     curr.val = curr.next.val;
        //     curr.next.val = emp;
        //     curr= curr.next.next; 
        // }
        // curr = head;

        // while(curr!=null){
        //     temp.next = curr;
        //     curr=curr.next;
        //     temp=temp.next;
        // }

        // return dummy.next;
        
    }
}