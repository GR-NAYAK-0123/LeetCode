// Problem: Remove Nth Node From End of List
// Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
// Time: O(n) + O(n)
// Space: O(1)

package LinkedList.Medium;

public class Remove_Nth_Node_From_End_of_List {
    // Good approach to solve this problem
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        if(count - n == 0){
            return head.next;
        }
        int target = count - n;
        count = 0;
        temp = head;
        ListNode prev = null;
        while(count != target){
            prev = temp;
            temp = temp.next;
            count++;
        }
        prev.next = temp.next;
        return head;
    }
}
