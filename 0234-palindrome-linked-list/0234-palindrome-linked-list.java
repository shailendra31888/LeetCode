class Solution {
    public boolean isPalindrome(ListNode head) {
        // Step 1: Reverse the list (or a copy)
        ListNode rev = reverse(cloneList(head)); // clone the list to avoid destroying original

        // Step 2: Compare original and reversed
        while (rev != null && head != null) {
            if (rev.val != head.val) {
                return false;
            }
            rev = rev.next;
            head = head.next;
        }
        return true;
    }

    // Correct reverse function
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    // Optional: Clone the list if you don't want to destroy the original
    public ListNode cloneList(ListNode head) {
        if (head == null) return null;
        ListNode newHead = new ListNode(head.val);
        ListNode curr = newHead;
        head = head.next;
        while (head != null) {
            curr.next = new ListNode(head.val);
            curr = curr.next;
            head = head.next;
        }
        return newHead;
    }
}
