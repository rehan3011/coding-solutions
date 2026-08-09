# Swap Nodes in Pairs

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

 

 **Example 1:** 

 **Input:**  head = [1,2,3,4]

 **Output:**  [2,1,4,3]

 **Explanation:** 

 **Example 2:** 

 **Input:**  head = []

 **Output:**  []

 **Example 3:** 

 **Input:**  head = [1]

 **Output:**  [1]

 **Example 4:** 

 **Input:**  head = [1,2,3]

 **Output:**  [2,1,3]

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 100].
- 0 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.2 MB (beats 12.25%)  
**Submitted:** 2026-02-09T08:02:34.668Z  

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
```

---

[View on LeetCode](https://leetcode.com/problems/swap-nodes-in-pairs/)