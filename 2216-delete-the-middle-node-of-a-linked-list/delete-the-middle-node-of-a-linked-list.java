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
    public ListNode deleteMiddle(ListNode head) {
       ListNode temp=head;
       int c=0;
       while(temp!=null){
        c++;
        temp=temp.next;
       } 
       if(c==1){
        head=head.next;
        return head;
       }
       c=c/2;
       ListNode t=head;
       int cnt=0;
       while(t!=null){
         cnt++;
         if(c==cnt){
         t.next=t.next.next;
            break;
         }
        
         t=t.next;
       }
    return head;
    }
}