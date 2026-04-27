// Problem: Add Two Numbers
// Link: https://leetcode.com/problems/add-two-numbers/description/
// Time: O(maximum of length (l1, l2))
// Space: O(maximum of length (l1, l2))

package LinkedList.Medium;

public class Add_Two_Numbers {
    // Best approach to solve this problem
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            temp.next = new ListNode(sum % 10);
            carry = sum / 10;
            temp = temp.next;
        }
        return newHead.next;
    }
}
