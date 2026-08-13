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
    public ListNode partition(ListNode head, int x) {
        ListNode low = new ListNode(0);
        ListNode high = new ListNode(0);
        ListNode temp = head;
        ListNode lower= low;
        ListNode higher= high;
        while(temp!=null){
           if(temp.val<x){
           lower.next=temp;
           lower=lower.next;
           }
           else {
            higher.next=temp;
            higher=higher.next;
           }
           temp= temp.next;
        }
        higher.next=null;
        lower.next=high.next;
        return low.next;
    }
}