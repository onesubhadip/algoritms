package org.codepractice.dcp.easy.problem452;

/**
 * Problem #: 452
 * Problem description:
 *
 * Let's represent an integer in a linked list format by having each node represent a digit in the number. The nodes make up the number in reversed order.
 *
 * For example, the following linked list:
 *
 * 1 -> 2 -> 3 -> 4 -> 5
 * is the number 54321.
 *
 * Given two linked lists in this format, return their sum in the same linked list format.
 *
 * For example, given
 *
 * 9 -> 9
 * 5 -> 2
 * return 124 (99 + 25) as:
 *
 * 4 -> 2 -> 1
 */
public class Problem452 {

    protected static ListNode linkedListSum(ListNode op1, ListNode op2) {
        if(op1 == null) return op2;
        if(op2 == null) return op1;

        var result = new ListNode(0, null);
        var it1 = op1;
        var it2 = op2;
        var it3 = result;
        var carry = 0;
        while(it1 != null || it2 != null) {
            int sum = carry;
            if(it1 != null) {
                sum += it1.val;
                it1 = it1.next;
            }
            if(it2 != null) {
                sum += it2.val;
                it2 = it2.next;
            }
            it3.next = new ListNode(sum % 10, null);
            carry = sum / 10;
            it3 = it3.next;
        }
        if(carry != 0) {
            it3.next = new ListNode(carry, null);
        }
        return result.next;
    }

    protected static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
