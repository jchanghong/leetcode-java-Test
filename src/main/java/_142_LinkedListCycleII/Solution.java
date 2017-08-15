/**
 * Time : O(N); Space : O(N)
 * @tag : Linked List; Two Pointers
 * @by  : Steven Cooks
 * @date: Jul 2, 2015
 ***************************************************************************
 * Description: 
 * 
 * Given a linked list, return the node where the cycle begins. 
 * If there is no cycle, return null. 
 * 
 * Follow up: 
 * 
 * Can you solve it without using extra space?
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/linked-list-cycle-ii/ }
 */
package _142_LinkedListCycleII;

import com.leetcode.ListNode;

/** see test {@link _142_LinkedListCycleII.SolutionTest } */
public class Solution {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow.next) {
                break;
            }
        }
        // no cycle
        if (fast == null || fast.next == null) {
            return null;
        }
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
    
}
