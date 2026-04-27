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
        Stack<Integer> stack=new Stack<>();
        ListNode fast=head;
        ListNode slow=null;
        ListNode temp=null;
        while(fast!=null){
            temp=slow; 
            slow=fast;
            fast=fast.next;
            slow.next=temp;
            
            
        }
        return slow;
        
    }
}
