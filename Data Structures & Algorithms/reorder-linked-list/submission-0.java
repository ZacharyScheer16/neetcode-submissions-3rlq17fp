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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(head == null || head.next == null){return;}

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //slow = midddle

        ListNode curr = slow.next;
        ListNode prev = null;
        slow.next = null; // first list end at null


        //reverse
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }//second half revers

        ListNode first = head;
        ListNode second = prev;


        //merger
        while(first != null && second != null){
            ListNode temp1 = first.next;
            ListNode  temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }


    }
}
