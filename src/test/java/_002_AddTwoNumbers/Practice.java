/**
 *******************************************************************************
 * Description: 
 * 
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain 
 * a single digit. Add the two numbers and return it as a linked list. 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) 
 * Output: 7 -> 0 -> 8
 * 
 *******************************************************************************
 * @tag : Linked List; Math
 * {@link https://leetcode.com/problems/add-two-numbers/ }
 */
package _002_AddTwoNumbers;

import com.leetcode.ListNode;

/** see test {@link _002_AddTwoNumbers.PracticeTest } */
public class Practice {

    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        // TODO Auto-generated method stub
        ListNode head = new ListNode(0);
        ListNode pre = head;
        boolean big10 = false;
        while (a != null && b != null) {
            int sum = a.val + b.val;
            if (big10) {
                sum++;
            }
            ListNode listNode = new ListNode(0);
            if (sum < 10) {
                listNode.val = sum;
                big10 = false;
            }
            else {
                sum = sum - 10;
                listNode.val = sum;
                big10 = true;
            }
            pre.next = listNode;
            pre = listNode;
            a = a.next;
            b = b.next;

        }
        while (a != null) {
            int sum = a.val;
            if (big10) {
                sum++;
            }
            ListNode listNode = new ListNode(0);
            if (sum < 10) {
                listNode.val = sum;
                big10 = false;
            }
            else {
                sum = sum - 10;
                listNode.val = sum;
                big10 = true;
            }
            pre.next = listNode;
            pre = listNode;
            a = a.next;
        }
        while (b != null) {
            int sum = b.val;
            if (big10) {
                sum++;
            }
            ListNode listNode = new ListNode(0);
            if (sum < 10) {
                listNode.val = sum;
                big10 = false;
            }
            else {
                sum = sum - 10;
                listNode.val = sum;
                big10 = true;
            }
            pre.next = listNode;
            pre = listNode;
            b = b.next;
        }
        if (big10) {
            pre.next = new ListNode(1);
        }
        return head.next;
    }

}
