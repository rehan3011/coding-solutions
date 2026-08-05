# Remove Duplicates from Sorted List II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a sorted linked list,  *delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list*. Return  *the linked list  **sorted**  as well*.

 

 **Example 1:** 

```
Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]

```

 **Example 2:** 

```
Input: head = [1,1,1,2,3]
Output: [2,3]

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 300].
- -100 <= Node.val <= 100
- The list is guaranteed to be sorted in ascending order.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.4 MB  
**Submitted:** 2026-08-05T16:29:49.817Z  

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
    public ListNode deleteDuplicates(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }


        ListNode first = new ListNode(0,head);

        ListNode prev = first;

        while(head.next!=null){
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
```

---

[View on LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)