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
public class Solution {
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null; // No lists to merge
        }

        // Min-heap to store the nodes based on their values
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.val, b.val)
        );

        // Add the head of each list to the min-heap
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }

        // Dummy node to build the result list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Process the min-heap
        while (!minHeap.isEmpty()) {
            // Get the smallest node
            ListNode smallest = minHeap.poll();
            current.next = smallest; // Append to the result
            current = current.next; // Move forward

            // If there is a next node in the same list, add it to the heap
            if (smallest.next != null) {
                minHeap.offer(smallest.next);
            }
        }

        return dummy.next; // Return the merged list
    }

    public static void main(String[] args) {
        // Input example: [[1,4,5],[1,3,4],[2,6]]
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
        lists[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
        lists[2] = new ListNode(2, new ListNode(6));

        // Call the function
        ListNode result = mergeKLists(lists);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
