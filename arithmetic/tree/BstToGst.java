/**
 * @author vanku
 * @date 2020/6/8
 * @leetCode 1038
 * @title 给出二叉 搜索 树的根节点，该二叉树的节点值各不相同，修改二叉树，使每个节点 node 的新值等于原树中大于或等于 node.val 的值之和。
 * <p>
 * 提醒一下，二叉搜索树满足下列约束条件：
 * <p>
 * 节点的左子树仅包含键 小于 节点键的节点。
 * 节点的右子树仅包含键 大于 节点键的节点。
 * 左右子树也必须是二叉搜索树。
 *  
 * <p>
 * 示例：
 * <p>
 * <p>
 * <p>
 * 输入：[4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
 * 输出：[30,36,21,36,35,26,15,null,null,null,33,null,null,null
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-search-tree-to-greater-sum-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @timeComplexity
 * @spaceComplexity
 */


public class BstToGst {

    public static void main(String[] args) {
    }

    int sum = 0;

    public TreeNode solution(TreeNode root) {
        if(root != null){
            //反序中序遍历
            solution(root.right);
            sum = sum + root.val;
            root.val = sum;
            solution(root.left);
        }
        return root;
    }

}
