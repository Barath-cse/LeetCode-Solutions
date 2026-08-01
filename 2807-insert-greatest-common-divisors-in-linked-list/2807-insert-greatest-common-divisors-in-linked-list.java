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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null)return head;
        ListNode dummy=head;
        while(dummy.next!=null){
            int a=dummy.val;
            int b=dummy.next.val;
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            ListNode temp=new ListNode(a);
            ListNode temp2=dummy.next;
            dummy.next=temp;
            temp.next=temp2;
            dummy=dummy.next.next;
        }
        return head;
    }    
    
}