package base;

/**
 * @author vanku
 * @date 2019/11/8
 * @time 13:01
 * @content 双向链表
 */


public class ListNode {

    public int val;
    public ListNode prev;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }
    public static String print(ListNode t){
        StringBuilder sb = new StringBuilder();
        while (t.next != null){
            sb.append(t.val);
            t = t.next;
        }
        return sb.toString();
    }
}
