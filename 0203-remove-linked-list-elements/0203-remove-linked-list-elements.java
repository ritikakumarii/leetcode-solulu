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
       
    //    while(head!=null&& head.val==val) {
    //     head = head.next;
    //    } 
    //    ListNode temp = head;
       
    //    while(temp!=null && temp.next!=null){
       
        
    //     if(temp.next.val==val){
          
    //         temp.next=temp.next.next;
    //     }
    //     else{
    //         temp=temp.next;
    //     }
    //     // if(temp.val!=temp.next.val){
    //     //     temp=temp.next;
    //    }

    //    return head;
    if(head==null ) return null;
    while(head!=null && head.val==val){
        head=head.next;
    }
    ListNode curr=head;
    ListNode prev=null;
    while(curr!=null){
        if(curr.val!=val){
        prev= curr;
        curr=curr.next;
        }
        else{
            prev.next=curr.next;
            curr=curr.next;
        }
    }
    return head;
    }
}