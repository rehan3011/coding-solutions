/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static int len(ListNode l){
        int len = 0;
        while(l!=null){
            len++;
            l = l.next;
        }
        return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
       int lenA = len(headA);
       int lenB = len(headB);

       ListNode p1 = headA;
       ListNode p2 = headB;

       while(lenA>lenB){
        p1 = p1.next;
        lenA--;
       }

       while(lenB>lenA){
        p2 = p2.next;
        lenB--;
       }

       while(p1!=null||p2!=null){
        if(p1==p2){
            return p1;
        }
        p1 = p1.next;
        p2 = p2.next;
       }

         return null;
    }
   
}






       //optimal solution
        // ListNode p1 = headA;
        // ListNode p2 = headB;

        // while(p1!=p2){
        //    p1= (p1==null)?headB:p1.next;
        //    p2= (p2==null)?headA:p2.next;
        // }
        // return p2;