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
    public ListNode reverseList(ListNode head) {
        //Input: head = [0,1,2,3]
        ListNode curr = head; // = 0
        ListNode prev = null; //these are the start: null -> 0 ->...
        while(curr != null){
            //need to assign next so that our head can get swapped
            ListNode next = curr.next; //iteration 1: points to 1; iteration 2: 2, iteration 3: 3
            curr.next = prev; //iteration 1: null <- 
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
