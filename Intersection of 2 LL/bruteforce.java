public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        while (head2!=null){
            ListNode temp=head1;
            while (temp!=null){
                if (temp==head2)
                return head2;
                temp=temp.next;
            }
            head2=head2.next;
        }
        return null;
    }
}
