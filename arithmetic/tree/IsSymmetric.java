/**
 * @author Albert Ku
 * @date 2020/1/23
 * @time 17:17
 */
public class IsSymmetric {

    boolean function(TreeNode treeNode) {
        return isMirror(treeNode, treeNode);

    }

    static boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
                && isMirror(t1.right, t2.left)
                && isMirror(t1.left, t2.right);
    }
}
