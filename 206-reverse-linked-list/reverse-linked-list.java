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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> st=new Stack<>();
        if(head==null || head.next==null) return head;
        ListNode t1=head;
        while(t1!=null){
            st.push(t1.val);
            t1=t1.next;
        }
        ListNode temp=head;
        while(temp!=null){
            temp.val=st.peek();
            st.pop();
            temp=temp.next;
        }
    return head;
    }
}