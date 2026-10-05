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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next== null||left==right) return head;
        // Method 1
        // ListNode dummy =new ListNode(0);
        // dummy.next=head;
        // ListNode prev = dummy;
        // // move prev before the left 
        // for(int i = 1;i<left;i++){
        //     prev=prev.next;
        // }
        
        // ListNode curr = prev.next;
        

        
        // // reverse the sublist
        // for(int i = 0 ; i<right-left;i++){
        //     ListNode temp = curr.next;
        //     curr.next=temp.next;
        //     temp.next=prev.next;
        //     prev.next=temp;
        // }
        // return dummy.next;



        // Method2
        ListNode curr=head;
        ListNode prev=null;
        int i=1;
        while(curr!=null && i<left){
            prev= curr;
            curr=curr.next;
            i++;
        }
       ListNode pts=prev;
       ListNode  leftu=curr;
        // simply reverse
        while(curr!=null && i<right+1){
        ListNode post= curr.next;
        curr.next=prev;
        prev=curr;
        curr=post;
        i++;
        }
        leftu.next=curr;
        if(pts!=null){
        
        pts.next=prev;
        }
        else return prev; 
        return head;
    }
}
    
