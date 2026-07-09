public class MergeTwoSortedLists {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Write your logic here
        
        return null;
    }
    public static void main(String[] args) {
        MergeTwoSortedLists obj = new MergeTwoSortedLists();
        // List 1: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
        // List 2: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);
        ListNode head = obj.mergeTwoLists(list1, list2);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}