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
    public ListNode mergeNodes(ListNode head) {
        if(head.val==0){
            head=head.next;
        }
        ListNode temp=head;
        while(temp!=null){
         if(temp.next.val!=0){
            temp.val+=temp.next.val;
            temp.next=temp.next.next;
         }
         else{
            temp.next=temp.next.next;
            temp=temp.next;
         }
        }
    return head;

    }
}