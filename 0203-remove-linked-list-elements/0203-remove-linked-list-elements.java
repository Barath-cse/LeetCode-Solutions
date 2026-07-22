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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(0);
        ListNode temp=head;
        ListNode temp2=dummy;
        while(temp!=null){
            if(temp.val!=val){
                temp2.next=new ListNode(temp.val);
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}