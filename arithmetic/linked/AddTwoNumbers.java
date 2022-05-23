package linked;

import base.ListNode;

import java.util.LinkedList;


/**
 * @author vanku
 * @date 2020/3/5
 * @leetCode 2
 * @timeComplexity
 * @spaceComplexity
 */


public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(2);
//        System.out.println(ListNode.print(addTwoNumbers(l1, l2)));
        System.out.println(ListNode.print(addTwoNumbers(l1, l2)));

    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            int q = (l1 == null) ? 0 : l1.val;
            int p = (l2 == null) ? 0 : l2.val;
            int sum = q + p + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }

    static ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        Integer carry = 0;
        ListNode head = null;
        ListNode tail = null;
        while (l1 != null || l2 != null) {
            Integer num1 = l1 == null ? 0 : l1.val;
            Integer num2 = l2 == null ? 0 : l2.val;
            Integer sum =  num1 + num2 + carry;
            if (head==null){
                head = tail = new ListNode(sum % 10);
            }else{
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }
}
