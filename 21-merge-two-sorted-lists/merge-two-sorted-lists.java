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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return list1;
        else if(list1==null) return list2;
        else if(list2==null) return list1;
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode prev=null;
       if(temp1.val>temp2.val){
            ListNode x=new ListNode(temp2.val);
            x.next=temp1;
            temp1=x;
            list1=x;
            prev=x;
            temp2=temp2.next;
        }
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                prev=temp1;
                temp1=temp1.next;
            }
            else{
                ListNode x=new ListNode(temp2.val);
                x.next=temp1;
                prev.next=x;
                prev=x;
                temp2=temp2.next;  
            }
        }
        while(temp2!=null){
             ListNode x=new ListNode(temp2.val);
                x.next=temp1;
                prev.next=x;
                prev=x;
                temp2=temp2.next; 
        }
    return list1;
    }
}