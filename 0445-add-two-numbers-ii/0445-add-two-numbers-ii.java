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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev= null;
        ListNode post= null;
        while(curr!=null){
            post = curr.next;
            curr.next=prev;
            prev=curr;
            curr=post;

        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode head1= reverse(l1);
      ListNode head2 = reverse(l2);
      int carry=0;
      ListNode dummy=new ListNode(0);
      ListNode ans=dummy;
      while(head1!=null || head2!=null|| carry!=0){
        int sum=carry;
       if(head1!=null){
        sum+=head1.val;
        head1=head1.next;

       }
       if(head2!=null){
        sum+=head2.val;
        head2=head2.next;

       }
       carry=sum/10;
       ans.next=new ListNode(sum%10);
       ans=ans.next;
      }
     return reverse(dummy.next);
    }
}