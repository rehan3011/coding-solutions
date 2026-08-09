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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //Approach two

        ListNode meow = new ListNode(0);
        meow.next = head;
        ListNode slow = meow;
        ListNode fast = meow;
        int i =0;
        while(i<=n){
            fast= fast.next;
            i++;
        }

        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next = slow.next.next;

        return meow.next;
    }
}





// Approach one:)
// //         ListNode  curr;
// //         ListNode temp=head;
// //         int c=0;
// //         curr=head;
// //         while(temp!=null){
// //             c++;
// //             temp= temp.next;
// //         }
// //         if(c==n) return head.next;

// //         for(int i=1; i<c-n; i++){
// //             curr = curr.next;
// //         }

// //         curr.next = curr.next.next;

// //         return head;


//     }
// }