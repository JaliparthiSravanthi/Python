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
    public int getDecimalValue(ListNode head) {
         ListNode temp=head;
         int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        } 
        ListNode t=head;
        int sum=0;
        while(t!=null){
            if(t.val==1){
               sum+=Math.pow(2,c-1);
            }
            t=t.next;
            c--;
        }
    return sum;
    }
}