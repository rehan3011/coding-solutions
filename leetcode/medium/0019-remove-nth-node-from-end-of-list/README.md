# Remove Nth Node From End of List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a linked list, remove the `nth` node from the end of the list and return its head.

 

 **Example 1:** 

```
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

```

 **Example 2:** 

```
Input: head = [1], n = 1
Output: []

```

 **Example 3:** 

```
Input: head = [1,2], n = 1
Output: [1]

```

 

 **Constraints:** 

- The number of nodes in the list is sz.
- 1 <= sz <= 30
- 0 <= Node.val <= 100
- 1 <= n <= sz

 

 **Follow up:**  Could you do this in one pass?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.7 MB (beats 6.91%)  
**Submitted:** 2026-02-09T06:19:21.373Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)