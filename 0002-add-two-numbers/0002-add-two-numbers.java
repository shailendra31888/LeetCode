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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy node to simplify code
        ListNode current = dummyHead; // Pointer to build the result list
        int carry = 0; // To handle the carry-over during addition

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with the carry from the previous operation
            
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            carry = sum / 10; // Update the carry for the next iteration
            current.next = new ListNode(sum % 10); // Add the digit to the result list
            current = current.next; // Move to the next node
        }

        return dummyHead.next; // Return the result list, skipping the dummy node
    }
}
