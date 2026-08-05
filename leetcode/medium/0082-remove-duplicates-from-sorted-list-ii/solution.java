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
    public ListNode deleteDuplicates(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }


        ListNode first = new ListNode(0,head);

        ListNode prev = first;

        while(head!=null){
            if(head.next!=null&&head.val==head.next.val){
                while(head.next!=null&&head.val==head.next.val){
                    head = head.next;
                }
                prev.next = head.next;
            }
            else{
                prev = prev.next;
            }
            head = head.next;
        }

        return first.next;
    //    ListNode newHead = new ListNode(-1);
    //    newHead.next = head;
    //    ListNode curr = head;
    //    ListNode prev = newHead;

    //    while(curr!=null&&curr.next!=null){
    //     if(curr.val == curr.next.val){
    //         while(curr.next!=null&& curr.val==curr.next.val){
    //             curr= curr.next;
    //         }
    //         prev.next = curr.next;
    //     }
    //     else{
    //         prev = prev.next;
    //     }
    //     curr = curr.next;
    //    }

    //     return newHead.next;


    }
}