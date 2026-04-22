// Problem: Palindrome Linked List
// Link: https://leetcode.com/problems/palindrome-linked-list/description/
// Time: O(n) + O(n)
// Space: O(n) Here is the extra space is for the ArrayList

package LinkedList.Easy;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Linked_List {
    // Extreme naive approach to solve this one by taking the extra space
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        // Now we can check for the palindrome
        int n = list.size();
        for(int i = 0;i<n/2;i++){
            if(list.get(i) != list.get(n-i-1)) return false;
        }
        return true;
    }

    // Here is another better approach to solve this problem without taking any extra space
    // Here the time complexity will be [O(n) + O(n/2) + O(n/2)] and O(1) space complexity
    // O(n) for finding the middle of the linked list
    // O(n/2) for reversing the half of the linked list
    // O(n/2) for traversing both the linked list
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode front = head;
        while(head != null){
            front = front.next;
            head.next = prev;
            prev = head;
            head = front;
        }
        return prev;
    }
    public boolean isPalindrome1(ListNode head) {
        // First we have to find the middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverse(slow);
        fast = head;
        while(newHead != null && fast != null){
            if(newHead.val != fast.val) return false;
            newHead = newHead.next;
            fast = fast.next;
        }
        return true;
    }
}
