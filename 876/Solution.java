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

    int middleIndex = -1;

    public ListNode middleNode(ListNode head) {
        return search(head, 0);
    }

    private ListNode search(ListNode node, int index) {

        if (node.next == null) {

            middleIndex = index % 2 == 0 ? index / 2 : (index + 1) / 2;

            if (middleIndex == index) {
                return node;
            }
            return null;
        }

        ListNode middle = search(node.next, index + 1);

        if (middleIndex == index) {
            return node;
        }

        return middle;
    }

}
