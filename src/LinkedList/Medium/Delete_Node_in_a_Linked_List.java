// Problem: Delete Node in a Linked List
// Link: https://leetcode.com/problems/delete-node-in-a-linked-list/description/
// Time: O(n)
// Space: O(1)

package LinkedList.Medium;

public class Delete_Node_in_a_Linked_List {
    // Basic approach
    public void deleteNode(ListNode node) {
        ListNode temp = node.next;
        while (temp.next != null) {
            node.val = temp.val;
            node = temp;
            temp = temp.next;
        }
        node.val = temp.val;
        node.next = null;
    }
}

// This is the structure of the ListNode class
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
