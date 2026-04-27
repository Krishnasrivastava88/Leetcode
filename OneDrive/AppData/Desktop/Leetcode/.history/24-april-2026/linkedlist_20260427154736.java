class Solution {
    public void deleteNode(ListNode node) {
    // first solution
    // node.val=node.next.val;
    //   node.next=node.next.next;
    // second solution
    ListNode temp=node;
    ListNode prev=null;
    while(temp.next!=null){
        temp.val=temp.next.val;
        prev=temp;
        temp=temp.next;
    }
    prev.next=null;
    }
}