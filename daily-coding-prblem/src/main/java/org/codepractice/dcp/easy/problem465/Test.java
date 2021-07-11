package org.codepractice.dcp.easy.problem465;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {

        test1();
        test2();
        test3();
        test4();

    }

    static void test1() {
        System.out.println("TEST 1");
        Problem.ListNode head = createLinkedList(1,2,3,4);
        printList(head);
        Problem.ListNode reversedList = Problem.reverse(head);
        printList(reversedList);
    }

    static void test2() {
        System.out.println("TEST 2");
        Problem.ListNode head = createLinkedList(1);
        printList(head);
        Problem.ListNode reversedList = Problem.reverse(head);
        printList(reversedList);
    }

    static void test3() {
        System.out.println("TEST 3");
        Problem.ListNode head = createLinkedList();
        printList(head);
        Problem.ListNode reversedList = Problem.reverse(head);
        printList(reversedList);
    }

    static void test4() {
        System.out.println("TEST 4");
        Problem.ListNode head = createLinkedList(3,3,4,4);
        printList(head);
        Problem.ListNode reversedList = Problem.reverse(head);
        printList(reversedList);
    }

    static void printList(Problem.ListNode head) {
        if(head == null) {
            System.out.println("null");
            return;
        }
        StringJoiner joiner = new StringJoiner(" -> ");
        while(head != null) {
            joiner.add(String.valueOf(head.val));
            head = head.next;
        }
        System.out.println(joiner.toString());
    }

    static Problem.ListNode createLinkedList(int... numbers) {
        var head = new Problem.ListNode();
        var tmp = head;
        for(var i: numbers) {
            tmp.next = new Problem.ListNode(i);
            tmp = tmp.next;
        }
        return head.next;
    }
}
