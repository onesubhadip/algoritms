package org.codepractice.dcp.easy.problem465;

public class Problem {

    public static ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode tmp1 = head;
        ListNode tmp2 = head.next;
        ListNode tmp3;
        while(tmp2!=null) {
            tmp3 = tmp2.next;
            tmp2.next = tmp1;
            tmp1 = tmp2;
            tmp2 = tmp3;
        }
        head.next = null;
        return tmp1;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(){}
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
