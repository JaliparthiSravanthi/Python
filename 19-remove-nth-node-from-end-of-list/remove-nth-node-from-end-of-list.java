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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        c=c-n;
        if(c==0){
            head=head.next;
            return head;
        }
        ListNode t=head;
        ListNode prev=null;
        int k=0;
        while(t!=null){
         if(k==c){
            prev.next=t.next;
            break;
         }
         k++;
         prev=t;
         t=t.next;
        }
    return head;
    }
}