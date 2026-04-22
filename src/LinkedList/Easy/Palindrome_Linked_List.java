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
}
