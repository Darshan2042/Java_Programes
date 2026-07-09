public class ReverseLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode curr = head;
        ListNode pre = null;
        while(curr != null){
            ListNode nextnode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextnode;
        }
        head = pre;
        return head;
    }
    public static void main(String[] args) {
        ReverseLinkedList obj = new ReverseLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head = obj.reverseList(head);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}