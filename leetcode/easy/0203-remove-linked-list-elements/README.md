# Remove Linked List Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `head` of a linked list and an integer `val`, remove all the nodes of the linked list that has `Node.val == val`, and return  *the new head*.

 

 **Example 1:** 

```
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

```

 **Example 2:** 

```
Input: head = [], val = 1
Output: []

```

 **Example 3:** 

```
Input: head = [7,7,7,7], val = 7
Output: []

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 104].
- 1 <= Node.val <= 50
- 0 <= val <= 50

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 97.14%)  
**Memory:** 47.5 MB (beats 7.63%)  
**Submitted:** 2026-08-04T16:27:58.971Z  

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
    public ListNode removeElements(ListNode head, int val) {

        ListNode prev, curr;
        prev = null;
        curr = head;
        while(curr!=null){
            if(curr.val==val){
                if(prev==null){
                    head = curr.next;
                }
                else{
                    prev.next = curr.next;
                }

            }
            else{
                 prev = curr;
            }
           
            curr = curr.next;
        }

        return head;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-linked-list-elements/)