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
    public int[] nextLargerNodes(ListNode head) {
       ListNode temp = head;
       int n=0;
       while(temp!=null){
        temp=temp.next;
        n++;
       }
       ListNode temp2= null;
       int[] arr = new int[n];
       int i =0;
       temp=head;
       while(temp!=null ){
        temp2=temp.next;
        while(temp2!=null){
            if(temp2.val>temp.val){
            arr[i]=temp2.val;
            break;
            }
            temp2=temp2.next;
        }
        temp=temp.next;
        i++;
       }
        
       return arr; 
    }
}