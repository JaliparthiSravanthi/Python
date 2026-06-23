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
    public ListNode sortList(ListNode head) {
        List<Integer> ds=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ds.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(ds);
        ListNode t=head;
        int i=0;
        while(t!=null){
            t.val=ds.get(i);
            i++;
            t=t.next;
        }
    return head;
    }
}