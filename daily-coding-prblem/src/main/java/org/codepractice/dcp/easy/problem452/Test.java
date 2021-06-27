package org.codepractice.dcp.easy.problem452;

import org.codepractice.dcp.easy.problem452.Problem452.ListNode;

import static org.codepractice.dcp.easy.problem452.Problem452.linkedListSum;

public class Test {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCase5();
    }

    static void testCase1() {
        System.out.println("START :: Test Case 1");
        ListNode op1 = createListNumber(9, 9);
        ListNode op2 = createListNumber(2, 5);
        System.out.print("op1 : ");printListNumber(op1);
        System.out.print("op2 : ");printListNumber(op2);
        System.out.print("sum : ");printListNumber(linkedListSum(op1, op2));
        System.out.println("END :: Test Case 1");
    }

    static void testCase2() {
        System.out.println("START :: Test Case 2");
        ListNode op1 = createListNumber();
        ListNode op2 = createListNumber(2, 5);
        System.out.print("op1 : ");printListNumber(op1);
        System.out.print("op2 : ");printListNumber(op2);
        System.out.print("sum : ");printListNumber(linkedListSum(op1, op2));
        System.out.println("END :: Test Case 2");
    }

    static void testCase3() {
        System.out.println("START :: Test Case 3");
        ListNode op1 = createListNumber(9, 9);
        ListNode op2 = createListNumber();
        System.out.print("op1 : ");printListNumber(op1);
        System.out.print("op2 : ");printListNumber(op2);
        System.out.print("sum : ");printListNumber(linkedListSum(op1, op2));
        System.out.println("END :: Test Case 3");
    }

    static void testCase4() {
        System.out.println("START :: Test Case 4");
        ListNode op1 = createListNumber(2, 5);
        ListNode op2 = createListNumber(1, 0, 0, 0);
        System.out.print("op1 : ");printListNumber(op1);
        System.out.print("op2 : ");printListNumber(op2);
        System.out.print("sum : ");printListNumber(linkedListSum(op1, op2));
        System.out.println("END :: Test Case 4");
    }

    static void testCase5() {
        System.out.println("START :: Test Case 5");
        ListNode op1 = createListNumber(2, 5);
        ListNode op2 = createListNumber(0, 0, 0, 0);
        System.out.print("op1 : ");printListNumber(op1);
        System.out.print("op2 : ");printListNumber(op2);
        System.out.print("sum : ");printListNumber(linkedListSum(op1, op2));
        System.out.println("END :: Test Case 5");
    }

    static ListNode createListNumber(int ... digits) {
        var fakeDigit = new ListNode(0, null);
        var tmp = fakeDigit;
        for (int i = digits.length -1; i >=0 ; i--) {
            tmp.next = new ListNode(digits[i], null);
            tmp = tmp.next;
        }
        return fakeDigit.next;
    }

    static void printListNumber(ListNode number) {
        boolean isFistDigit = true;
        while(number != null) {
            if(isFistDigit) {
                isFistDigit = false;
                System.out.print(number.val);
            }else{
                System.out.print(" --> " + number.val);
            }
            number = number.next;
        }
        System.out.println();
    }
}
