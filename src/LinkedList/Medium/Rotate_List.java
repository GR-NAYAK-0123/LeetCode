// Problem: Rotate List
// Link: https://leetcode.com/problems/rotate-list/description/
// Time: O(n) + O(n - (k % n))
// Space: O(1)

package LinkedList.Medium;

public class Rotate_List {
    // Best approach to solve this problem
    public ListNode find_last(ListNode head, int target){
        ListNode temp = head;
        while(target != 1){
            target--;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        int len = 1;
        ListNode temp = head;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        if(k % len == 0) return head;
        temp.next = head;
        ListNode tail = find_last(head, len - (k % len));
        head = tail.next;
        tail.next = null;
        return head;
    }
}
