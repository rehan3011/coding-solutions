# Sort List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a linked list, return  *the list after sorting it in  **ascending order***.

 

 **Example 1:** 

```
Input: head = [4,2,1,3]
Output: [1,2,3,4]

```

 **Example 2:** 

```
Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]

```

 **Example 3:** 

```
Input: head = []
Output: []

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 5 * 104].
- -105 <= Node.val <= 105

 

 **Follow up:**  Can you sort the linked list in `O(n logn)` time and `O(1)` memory (i.e. constant space)?

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 51.40%)  
**Memory:** 59.4 MB (beats 49.27%)  
**Submitted:** 2026-08-20T17:12:57.262Z  

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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMiddleAndCut(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while (left != null && right != null) {
            if (left.val <= right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }

            current = current.next;
        }

        current.next = left != null ? left : right;

        return dummy.next;
    }

    private ListNode getMiddleAndCut(ListNode node) {
        ListNode slow = node;
        ListNode fast = node.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        slow.next = null;

        return mid;
    }
}
// public class Solution {
  
//   public ListNode sortList(ListNode head) {
//     if (head == null || head.next == null)
//       return head;
        
    
//     ListNode prev = null, slow = head, fast = head;
    
//     while (fast != null && fast.next != null) {
//       prev = slow;
//       slow = slow.next;
//       fast = fast.next.next;
//     }
    
//     prev.next = null;
    
    
//     ListNode l1 = sortList(head);
//     ListNode l2 = sortList(slow);
    
    
//     return merge(l1, l2);
//   }
  
//   ListNode merge(ListNode l1, ListNode l2) {
//     ListNode l = new ListNode(0), p = l;
    
//     while (l1 != null && l2 != null) {
//       if (l1.val < l2.val) {
//         p.next = l1;
//         l1 = l1.next;
//       } else {
//         p.next = l2;
//         l2 = l2.next;
//       }
//       p = p.next;
//     }
    
//     if (l1 != null)
//       p.next = l1;
    
//     if (l2 != null)
//       p.next = l2;
    
//     return l.next;
//   }

// }
```

---

[View on LeetCode](https://leetcode.com/problems/sort-list/)