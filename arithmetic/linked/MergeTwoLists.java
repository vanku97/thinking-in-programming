/**
 * @author Albert Ku
 * @date 2019/11/8
 * @time 13:01
 * @content
 */


public class MergeTwoLists {


    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next  = new ListNode(4);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        ListNode result = mergeTwoListsSolution(l1,l2);
        System.out.println(result);
    }

    static ListNode mergeTwoListsSolution(ListNode l1, ListNode l2){

        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }

        if(l1.val < l2.val) {
            l1.next = mergeTwoListsSolution(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoListsSolution(l1, l2.next);
            return l2;
        }
    }

}
