//You are given two non-empty linked lists representing two non-negative integers.
//        The digits are stored in reverse order and each of their nodes contain a single digit.
//        Add the two numbers and return it as a linked list.
//
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8


public class _0002_M_Add_Two_Numbers {
    public static void main(String[] args) {
    }
}

//Definition for singly-linked list.
class ListNode {
    int val;       //值
    ListNode next; //指针

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = l1, q = l2, currNode = head;
        int carry = 0;//进位
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            currNode.next = new ListNode(sum % 10);
            currNode = currNode.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            currNode.next = new ListNode(carry);
        }
        return head.next;
    }
}