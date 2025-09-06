package N_0019_remove_nth_node_from_end_of_list;

public class Solution {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        ListNode current = head;
        int length = 0;

        while (current != null) {
            length++;
            current = current.next;
        }

        if (length == n) {
            head = head.next;
            return head;
        }
        current = head;

        for (int i = 0; i < length - n - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        int n = 2;
        ListNode result = removeNthFromEnd(node, n);
        System.out.print(result);
    }
}
