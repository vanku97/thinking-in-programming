import base.ListNode;

/**
 * @author vanku
 * @date 2020/6/18
 * @leetCode 206
 * @title 反转链表
 * @timeComplexity
 * @spaceComplexity
 */


public class ReverseList {


    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        new ReverseList().solution(node);
//        ListNode solution = new ReverseList().solution2(node);
//        while (node.next != null) {
//            System.out.println(node.val);
//            node = node.next;
//        }
    }

    /**
     * while loop
     * time complexity: O(n)
     * space complexity: O(1)
     */
    public ListNode solution(ListNode node) {
        ListNode pre = node;
        ListNode curr = node.next;
        while (curr !=null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        node.next = null;
        return pre;
    }

    /**
     * recursion
     * time complexity: O(n)
     * space complexity: O(n)
     */
    public ListNode solution2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = solution2(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }


}
